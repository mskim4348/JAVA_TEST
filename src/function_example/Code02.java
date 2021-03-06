package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code02 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int a=1;
			
			loop(a,Integer.parseInt(st.nextToken()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b) {
		if(a<=b) {
			System.out.println(b);
			loop(a, --b);
		}
	}
}

/* 1902 : (재귀 함수) 1부터 n까지 역순으로 출력하기
 * 
 * 정수 n부터 1까지 출력하는 재귀함수를 설계하시오.
 * 
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 * 
 * 금지 키워드 : for while goto
 * 
 * 입력 정수 n이 입력된다(1<=n<=200) 
 * 출력 n부터 1까지 한 줄에 하나씩 출력한다.
 * 입력:10
 * 출력 10~1까지
 */