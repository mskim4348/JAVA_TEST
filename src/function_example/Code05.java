package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code05 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			loop(Integer.parseInt(st.nextToken()),1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b) {
		if(a!=1) {
			b*=a;
			loop(--a,b);
		}else {
			System.out.println(b);
		}
	}
}

/* 1912 : (재귀함수) 팩토리얼 계산
 *
 * 팩토리얼(!)은 다음과 같이 정의된다.
 * n!=n×(n−1)×(n−2)×⋯×2×1 즉, 5!=5×4×3×2×1=120 이다.
 * n이 입력되면 n!의 값을 출력하시오.
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 * 금지 키워드 : for while goto
 *
 * 입력 자연수 n이 입력된다. (n<=12)
 * 출력 n!의 값을 출력한다.
 * 입력예시 : 5
 * 출력예시 : 120
 */