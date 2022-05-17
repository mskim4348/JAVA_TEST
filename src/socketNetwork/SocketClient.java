package socketNetwork;

import java.io.IOException;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = null;
            		// 소켓 서버에 접속
			socket = new Socket("192.168.1.22" , 1234); 
			System.out.println("서버에 접속 성공!"); // 접속 확인용
			
            		// 서버에서 보낸 메세지 읽는 Thread
			ListeningThread t1 = new ListeningThread(socket);
			WritingThread t2 = new WritingThread(socket); // 서버로 메세지 보내는 Thread

			t1.start(); // ListeningThread Start
			t2.start(); // WritingThread Start
            
		} catch (IOException e) {
			e.printStackTrace(); // 예외처리
		}
	}
}
