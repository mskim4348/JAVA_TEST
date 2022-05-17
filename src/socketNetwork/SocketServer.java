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
			System.out.println("����: "+socket.getInetAddress()+"IP�� Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			
			// InputStream - Ŭ���̾�Ʈ���� ���� �޼��� �б�
			InputStream input=socket.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(input));
			
			// OutputStream - �������� Ŭ���̾�Ʈ�� �޼��� ������
			OutputStream out=socket.getOutputStream();
			PrintWriter writer=new PrintWriter(out, true);
			
			// Ŭ���̾�Ʈ���� ����Ǿ��ٴ� �޼��� ������
			writer.println("������ ����Ǿ����ϴ�.! ID�� �Է����ּ���");
			
			String readValue;// Client���� ���� �� ����
			String name=null;// Ŭ���̾�Ʈ �̸� ������
			boolean identify=false;
			
			// Ŭ���̾�Ʈ�� �޼��� �Է½ø��� ����
			while((readValue=reader.readLine()) !=null) {
				if(!identify) {
					name=readValue;
					identify=true;
					writer.println(name+"���� �����ϼ˽��ϴ�.");
					continue;
				}
			}
			
			// list �ȿ� Ŭ���̾�Ʈ ������ �������
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
			
			System.err.println("socket : "+socketPort+"���� ������ ���Ƚ��ϴ�.");
			
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
