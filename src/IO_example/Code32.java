package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code32 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			long data=Integer.parseInt(st.nextToken());
			System.out.printf("%d", ++data);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1044 : [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기(설명)
 * 
 * 정수를 1개 입력받아 1만큼 더해 출력해보자. 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 * 
 * 주의 계산되고 난 후의 값의 범위(데이터형)에 주의한다.
 * 
 * 참고 어떤 변수(a)에 값을 저장한 후 a+1 의 값을 출력할 수도 있고, ++a 연산을 한 후에 출력할 수도 있다.
 * 
 * ++a, --a, a++, a-- 와 같이 어떤 변수의 앞이나 뒤에 붙여 변수에 저장되어있는 값을 1만큼 더하거나 빼주는 연산자를
 * 증감연산자라고 한다.
 * 
 * 증감연산자를 변수 앞에 붙이면 그 변수를 사용하기 전에 증감을 먼저 수행하고, 증감연산자를 변수 뒤에 붙이면 일단 변수에 저장되어있는 값을
 * 먼저 사용하고 난 후 나중에 증감을 수행한다.
 * 
 * 입력 정수 1개가 입력된다. 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 * 출력 입력된 정수에 1을 더해 출력한다.
 * 
 * 입력예시 : 2147483647
 * 출력예시 : 2147483648
 */
