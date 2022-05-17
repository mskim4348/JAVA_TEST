package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기(설명)
public class Code15 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			switch (data) {
			case 12:
			case 1:
			case 2:
				System.out.println("winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("fall");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
