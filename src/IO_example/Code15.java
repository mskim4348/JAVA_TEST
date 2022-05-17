package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code15 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			int num=data.length();
			for(int i=0;i<data.length();i++) {
//				System.out.println(Integer.parseInt(data.substring(i,i+1))*(int)Math.pow(10, num-1));
				System.out.printf("[%d]\n",Integer.parseInt(data.substring(i,i+1))*(int)Math.pow(10, num-1));
				num--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
