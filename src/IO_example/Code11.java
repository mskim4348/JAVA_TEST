package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code11 {
	public static void main(String[] args) {
		try {
			char[] data=new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
			
			if(data.length<=50) {
				for(char c : data) {
					System.out.printf("%s",c);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
