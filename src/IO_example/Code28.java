package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code28 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			System.out.printf("%d", -Integer.parseInt(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기(설명)
 * 
 * 입력된 정수의 부호를 바꿔 출력해보자. 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
 * 
 * 참고 단항 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대로 바뀌어 계산된다.
 * 
 * 예시 int a; scanf("%d", &a); printf("%d", -a);
 * 
 * 입력 정수 1개가 입력된다.
 * 출력 부호를 바꿔 출력한다.
 * 
 * 입력예시 : -1
 * 출력예시 : 1
 */