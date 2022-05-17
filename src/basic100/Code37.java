package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code37 {
	public static void main(String[] args) {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String[] data = buff.readLine().split(" ");
			int day = 1;
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			int c = Integer.parseInt(data[2]);
			
			for (; ;) {
				if(day%a==0&&day%b==0&&day%c==0) {
					break;
				}
				day++;
			}
			System.out.println(day);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
