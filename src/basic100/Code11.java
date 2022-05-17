package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1064 : [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기(설명)
public class Code11 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			int data3=Integer.parseInt(st.nextToken());

			System.out.printf("%d",data1<data2?data1<data3?data1:data3 :data2<data3? data2:data3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
