package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1089 : [����-����] �� �����ϱ�1
public class Code34 {
	public static void main(String[] args) {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String[] data =buff.readLine().split(" ");
			int sum=Integer.parseInt(data[0]);
			int a=Integer.parseInt(data[1]);
			int mul=Integer.parseInt(data[2])-1;
			System.out.println(sum+(mul*a));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}