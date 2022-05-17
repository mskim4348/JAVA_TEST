package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code23 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%d",Integer.valueOf(data, 8));
//			System.out.println(Integer.valueOf(data, 2));
//			System.out.printf("%d\n",Integer.valueOf(data, 8));
//			System.out.printf("%d\n",Integer.valueOf(data, 10));
//			System.out.printf("%d\n",Integer.valueOf(data, 16));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 * 
 * 참고 %o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다. %d로 출력하면 10진수로 출력된다.
 * 
 * 예시 int n; scanf("%o", &n); printf("%d", n); (C언어에서 소스 코드 작성 시 0으로 시작하는 수는
 * 8진수로 인식된다. int a = 013; // 10진수 11과 같은 값)
 * 
 * 입력 8진 정수 1개가 입력된다. 
 * 출력 10진수로 바꾸어 출력한다.
 * 입력예시 : 13
 * 출력예시 : 11
 */


