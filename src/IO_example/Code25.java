package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code25 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			
			System.out.printf("%c", Integer.parseInt(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1037 : [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
 * 
 * 10진 정수 1개를 입력받아 아스키 문자로 출력해보자. 단, 0 ~ 255 범위의 정수만 입력된다.
 * 
 * 입력 10진 정수 1개(0 ~ 255 범위)가 입력된다.
 * 출력 아스키코드 값을 문자로 출력한다
 * 입력예시 : 65
 * 출력예시 : A
 */