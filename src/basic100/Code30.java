package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1085 : [기초-종합] 소리 파일 저장용량 계산하기(설명)
public class Code30 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String data[] =buff.readLine().split(" ");
			long num=Long.parseLong((data[0]))*Integer.parseInt(data[1])*Integer.parseInt(data[2])*Integer.parseInt(data[3]);
//			double num1=num/8.0/1024/1024;
			System.out.printf("%1.1f %s\n",(double)num/8.0/1024/1024,"MB");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
