package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code19 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%d",Long.parseLong(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1030 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기3(설명)
 * 
 * 정수 1개를 입력받아 그대로 출력해보자. 단, 입력되는 정수의 범위는 -9,223,372,036,854,775,808 ~
 * +9,223,372,036,854,775,807 이다.
 * 
 * 참고 -2147483648 ~ +2147483647 범위의 정수를 저장하고 처리하기 위해서는 int 데이터형을 사용해 변수를 선언하면
 * 된다. (int 로 선언하고 %d로 입력받아 저장하고, 출력하면 된다.)
 * 
 * int 형으로 저장할 수 있는 범위를 넘어가는 정수 값을 저장하기 위해서는 보다 큰 범위를 저장할 수 있는 다른 데이터형을 사용해야 한다.
 * 
 * long long int 데이터형을 사용하면 -9,223,372,036,854,775,808 ~
 * +9,223,372,036,854,775,807 범위의 정수값을 저장시킬 수 있다.
 * 
 * 예시 long long int n; scanf("%lld", &n); printf("%lld", n);
 * 
 * 입력 정수 1개가 입력된다. 단, 입력되는 정수의 범위는 -9223372036854775808 ~ +9223372036854775807이다.
 * 출력 입력된 정수를 그대로 출력한다.
 * 
 * 입력예시 : -2147483649
 * 출력예시 : -2147483649
 */

