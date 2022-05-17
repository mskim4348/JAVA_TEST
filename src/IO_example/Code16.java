package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code16 {
	public static void main(String[] args) {
		try {
			String[] data = new BufferedReader(new InputStreamReader(System.in)).readLine().split(":");
			System.out.printf("%d", Integer.parseInt(data[1]));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
