package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code14 {
	public static void main(String[] args) {
		try {
			char[] data = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
			for(char c : data) {
				System.out.printf("\'%s'\n",c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
