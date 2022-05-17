package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code10 {
	public static void main(String[] args) {
		try {
			String[] num=new BufferedReader(new InputStreamReader(System.in)).readLine().split("-");
			for(int i=0;i<num.length;i++) {
				System.out.printf("%s",num[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
