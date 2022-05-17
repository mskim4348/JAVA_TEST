package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code34 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			long data=0;
			data+=Integer.parseInt(st.nextToken());
			data+=Integer.parseInt(st.nextToken());
			data+=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d\n",data);
			System.out.printf("%1.1f\n",(float)data/3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기	
 *
 * 정수 3개를 입력받아 합과 평균을 출력해보자. 단, -2147483648 ~ +2147483647
 * 
 * 입력 정수 3개가 공백을 두고 입력된다. 단, -2147483648 ~ +2147483647
 * 출력 합과 평균을 줄을 바꿔 출력한다. 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
 * 
 * 입력예시 : 1 2 3
 * 출력예시 : 6
 * 		    2.0
 */