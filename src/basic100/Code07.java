package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
public class Code07 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",data1==0&&data2==0?1:0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
