package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기(설명)
public class Code14 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			char data=st.nextToken().charAt(0);
			switch (data) {
			case 'A':
				System.out.println("best!!!");
				break;
			case 'B':
				System.out.println("good!!");
				break;
			case 'C':
				System.out.println("run!");
				break;
			case 'D':
				System.out.println("slowly~");
				break;

			default:
				System.out.println("what?");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
