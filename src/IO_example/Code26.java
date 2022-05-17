package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code26 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			System.out.printf("%d", Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자. (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
 * 
 * 입력 2개의 정수가 공백으로 구분되어 입력된다. 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
 * 출력 두 정수의 합을 출력한다
 * 
 * 입력예시 : 123-123
 * 출력예시 : 0
 */