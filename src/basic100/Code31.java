package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1086 : [기초-종합] 그림 파일 저장용량 계산하기(설명)
public class Code31 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String data[] =buff.readLine().split(" ");
			long num=Long.parseLong((data[0]))*Integer.parseInt(data[1])*Integer.parseInt(data[2]);
			System.out.printf("%1.2f %s\n",(double)num/8.0/1024/1024,"MB");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
