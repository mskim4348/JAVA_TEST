package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code20 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%o",Integer.parseInt(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/* 1031 : [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기(설명)
 * 
 * 10진수를 입력받아 8진수(octal)로 출력해보자.
 * 
 * 참고 %d(10진수 형태)로 입력받고, %o를 사용해 출력하면 8진수(octal)로 출력된다.
 * 
 * 입력 10진수 1개가 입력된다. 단, 입력되는 정수는 int 범위이다.
 * 출력 8진수로 출력한다.
 * 
 * 입력예시 : 10
 * 출력예시 : 12
 */