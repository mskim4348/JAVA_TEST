package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1091 : [기초-종합] 수 나열하기3
public class Code36 {
	public static void main(String[] args) {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String[] data = buff.readLine().split(" ");
			long a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			int c = Integer.parseInt(data[2]);
			int d = Integer.parseInt(data[3]);

				for (int i = 1; i < d; i++) {
					a = a * b + c;
				}
//			}
			System.out.println(a);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
