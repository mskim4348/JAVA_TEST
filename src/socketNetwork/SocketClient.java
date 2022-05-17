package socketNetwork;

import java.io.IOException;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = null;
            		// ���� ������ ����
			socket = new Socket("192.168.1.22" , 1234); 
			System.out.println("������ ���� ����!"); // ���� Ȯ�ο�
			
            		// �������� ���� �޼��� �д� Thread
			ListeningThread t1 = new ListeningThread(socket);
			WritingThread t2 = new WritingThread(socket); // ������ �޼��� ������ Thread

			t1.start(); // ListeningThread Start
			t2.start(); // WritingThread Start
            
		} catch (IOException e) {
			e.printStackTrace(); // ����ó��
		}
	}
}
