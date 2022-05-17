package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1056 : [기초-논리연산] 참/거짓이 서로 다를 때에만 참 출력하기(설명)
public class Code05 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",data1!=data2?1:0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
