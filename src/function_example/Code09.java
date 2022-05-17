package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code09 {
	public static void main(String[] args) {

		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			loop(Integer.parseInt(st.nextToken()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void loop(int a) {
		System.out.println(a);
		if(a>1) {
			if(a%2==1) {
				a=3*a+1;
				loop(a);
			}else {
				a=a/2;
				loop(a);
			}
		}

	}
}

/*
 * 1928 : (재귀함수) 우박수 (3n+1) (basic)
 * 
 * 콜라츠의 추측, 3n+1 문제, 우박수 문제라고 불리는 이 문제는 다음과 같다.
 * 
 * 1, 어떤 자연수 n이 입력되면, 2. n이 홀수이면 3n+1을 하고, 3. n이 짝수이면 n2를 한다. 4. 이 n이 1이 될때까지 2
 * 3과정을 반복한다. 예를 들어 5는 5 → 16 → 8 → 4 → 2 → 1 이 된다. 이 처럼 어떤 자연수 n이 입력되면 위 알고리즘에
 * 의해 1이 되는 과정을 모두 출력하시오.
 * 
 * 입력 자연수 n이 입력된다.(1<=n<=10,000,000) 단, 3n+1이 되는 과정에서 int범위를 넘는 수는 입력으로 주어지지
 * 않는다. 출력 3n+1의 과정을 출력한다.
 * 
 * 입력예시 : 5 출력예시 : 5 16 8 4 2 1
 */