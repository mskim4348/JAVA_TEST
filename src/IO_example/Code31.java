package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code31 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			System.out.printf("%d",data1%data2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기(설명)
 * 
 * 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자. 단, 0 <= a, b <= +2147483647, b는 0이
 * 아니다.
 * 참고 C언어에서 정수%정수 연산의 결과는 나눈 나머지로 계산된다.
 * % 연산자(modulus, mod 연산) 수학자 가우스가 생각해낸 연산으로, 어떤 정수를 다른 정수로 나누고 난 후 남는 나머지를 계산하는
 * 연산이다.
 * 단, 음(-)이 아닌 정수에 대해서만 연산된다.
 * 
 * 입력 정수 2개(a, b)가 공백을 두고 입력된다. 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
 * 출력 a 를 b로 나눈 나머지를 출력한다.
 * 
 * 입력예시 10 3
 * 출력예시 1
 */