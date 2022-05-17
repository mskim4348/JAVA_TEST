package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기(설명)
public class Code13 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			
			if(data>=90) {
				System.out.println("A");
			}else if(data<90&&data>=70) {
				System.out.println("B");
			}else if(data<70&&data>=40) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
