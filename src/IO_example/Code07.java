package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code07 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d %d %d",num,num,num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/* 1017 : [기초-입출력] 정수 1개 입력받아 3번 출력하기(설명)
 *
 * int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
 * 
 * 참고 printf("%d %d %d", a, a, a); 와 같은 방법으로 출력할 수 있다.
 * 
 * 입력 정수 1개가 입력된다.
 * 출력 입력받은 정수를 공백으로 구분해 3번 출력한다.
 */