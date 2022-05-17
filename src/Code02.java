import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Code02 {
	private StringBuffer buffer;
	private Process process;
	private BufferedReader bufferdReader;
	private StringBuffer readBuffer;
	
	public static void main(String[] args) {
//		Runtime rt=Runtime.getRuntime();
//		
//		try {
//			Process pr=rt.exec("cmd /c start");
//			  OutputStream os = pr.getOutputStream();
////			   os.write("shutdown -s -f -t 90 \n\r".getBytes());
//			   os.close();
//			   pr.waitFor();
//
//		} catch (Exception e) {
//			
//		}
		Code02 cmd=new Code02();
		
		String command=cmd.inputCommand("shutdown -l");
		String result=cmd.execCommand(command);
		
		System.out.println(result);
	}
	public String inputCommand(String cmd) {
		buffer=new StringBuffer();
		
		buffer.append("cmd.exe /c");
		buffer.append(cmd);
		return buffer.toString();
	}
	public String execCommand(String cmd) {
		try {
			process=Runtime.getRuntime().exec(cmd);
			bufferdReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line =null;
			readBuffer =new StringBuffer();
			
			while((line=bufferdReader.readLine())!=null) {
				readBuffer.append(line);
				readBuffer.append('\n');
			}
			return readBuffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
