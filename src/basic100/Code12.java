package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1066 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀 출력하기(설명)
public class Code12 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			int data3=Integer.parseInt(st.nextToken());
			
			if(data1%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			if(data2%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			if(data3%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
