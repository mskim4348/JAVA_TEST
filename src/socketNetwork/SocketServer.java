package socketNetwork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SocketServer extends Thread{
	static ArrayList<Socket> list=new ArrayList<Socket>();
	static Socket socket=null;
	
	public SocketServer(Socket socket) {
		this.socket=socket;
		list.add(socket);
	}
	@Override
	public void run() {
		try {
			System.out.println("서버: "+socket.getInetAddress()+"IP의 클라이언트와 연결되었습니다.");
			
			// InputStream - 클라이언트에서 보낸 메세지 읽기
			InputStream input=socket.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(input));
			
			// OutputStream - 서버에서 클라이언트로 메세지 보내기
			OutputStream out=socket.getOutputStream();
			PrintWriter writer=new PrintWriter(out, true);
			
			// 클라이언트에게 연결되었다는 메세지 보내기
			writer.println("서버에 연결되었습니다.! ID를 입력해주세요");
			
			String readValue;// Client에서 보낸 값 저장
			String name=null;// 클라이언트 이름 설정용
			boolean identify=false;
			
			// 클라이언트가 메세지 입력시마다 수행
			while((readValue=reader.readLine()) !=null) {
				if(!identify) {
					name=readValue;
					identify=true;
					writer.println(name+"님이 접속하셧습니다.");
					continue;
				}
			}
			
			// list 안에 클라이언트 정보가 담겨있음
			for(int i=0;i<list.size();i++) {
				out=list.get(i).getOutputStream();
				writer=new PrintWriter(out,true);
				
				writer.println(name+"  :  "+readValue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			int socketPort=1234;
			ServerSocket serversocket=new ServerSocket(socketPort);
			
			System.err.println("socket : "+socketPort+"으로 서버가 열렸습니다.");
			
			while(true) {
				Socket socketUser=serversocket.accept();
				Thread thd=new SocketServer(socketUser);
				thd.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
