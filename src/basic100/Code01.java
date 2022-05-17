package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code01 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d",Integer.parseInt(st.nextToken())==Integer.parseInt(st.nextToken())?0:1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/* 1052 : [기초-비교연산] 두 정수 입력받아 비교하기4(설명)
 *
 * 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
 * 
 * 참고 어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational)를 사용할 수 있다.
 * 비교/관계연산자는 주어진 2개의 값을 비교하여 그 결과가 참인 경우 참(true)을 나타내는 정수값 1로 계산하고, 거짓인 경우
 * 거짓(false)를 나타내는 정수값 0으로 계산한다.
 * 비교/관계연산자도 일반적인 사칙연산자처럼 주어진 두 수를 이용해 계산을 수행하고, 그 결과를 1(참), 또는 0(거짓)으로 계산해 주는
 * 연산자이다.
 * 
 * 비교/관계연산자는 >, <, >=, <=, ==(같다), !=(다르다) 6개가 있다.
 * 
 * 예시 printf("%d", 123!=123); //비교 연산자 !=의 계산 결과인 0(거짓)이 출력된다.
 * 
 * 입력 두 정수 a, b가 공백을 두고 입력된다. -2147483647 <= a, b <= +2147483648
 * 출력 a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
 * 
 * 입력예시 : 0 1
 * 출력예시 : 1
 */