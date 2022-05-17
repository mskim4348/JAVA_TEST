package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code29 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%c",(st.nextToken().charAt(0))+1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기(설명)
 *
 * 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
 * 영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
 * 참고 숫자는 수를 표현하는 문자로서 '0' 은 문자 그 자체를 의미하고, 0은 값을 의미한다.
 * 힌트 아스키문자표에서 'A'는 10진수 65로 저장되고 'B'는 10진수 66으로 저장된다. 따라서 문자도 값으로 덧셈을 할 수 있다.
 * 
 * 입력 영문자 1개가 입력된다.
 * 출력 다음 문자를 출력한다.
 * 
 * 입력예시 a
 * 출력예시 b
 */