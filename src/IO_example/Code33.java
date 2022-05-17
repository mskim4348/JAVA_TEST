package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code33 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			System.out.printf("%d\n", data1+data2);
			System.out.printf("%d\n", data1-data2);
			System.out.printf("%d\n", data1*data2);
			System.out.printf("%d\n", data1/data2);
			System.out.printf("%d\n", data1%data2);
			System.out.printf("%1.2f\n", (float)data1/data2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
 * 
 * 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자. 단 0 <= a, b <=
 * 2147483647, b는 0이 아니다.
 * 
 * 입력 정수 2개가 공백을 두고 입력된다.
 * 
 * 
 * 출력 첫 줄에 합 둘째 줄에 차, 셋째 줄에 곱, 넷째 줄에 몫, 다섯째 줄에 나머지, 여섯째 줄에 나눈 값을 순서대로 출력한다. (실수,
 * 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
 * 
 * 입력예시 10 3
 * 출력 예시 
 * 13 
 * 7
 * 30
 * 3
 * 1
 * 3.33
 */
