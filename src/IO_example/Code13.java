package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code13 {
	public static void main(String[] args) {
		try {
			String[] data = new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\.");
			int test;
			for(int i=0;i<data.length;i++) {
//				System.out.printf("%d\n", (int)Integer.parseInt(data[i]));ÆÄ½ÌÀÌ
				test=Integer.parseInt(data[i]);
				System.out.println(test);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
