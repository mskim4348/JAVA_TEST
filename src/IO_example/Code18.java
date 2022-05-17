package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code18 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%.11f",Double.parseDouble(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2(설명)
 * 실수 1개를 입력받아 그대로 출력해보자. (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
 * 참고 float 데이터형을 사용하면 +- 3.4*10-38 ~ +- 3.4*1038 범위의 실수를 저장할 수 있다. (float 로
 * 선언하고 %f로 입력 받아 출력하면 된다.)
 * 
 * 이 범위를 넘어가는(더 작거나 더 큰) 실수를 저장하기 위해서는 보다 큰 범위를 저장할 수 있는 다른 데이터형을 사용해야 정상적으로
 * 저장시킬 수 있다. double은 더 정확하게 저장할 수 있지만, float보다 2배의 저장 공간이 필요하다.
 * 
 * double 데이터형을 사용하면 +- 1.7*10-308 ~ +- 1.7*10308 범위의 실수를 저장할 수 있다.
 * 예시 double d; scanf("%lf", &d); // double(long float) 형식으로 입력 printf("%lf",
 * d);
 * 
 * 입력 소수점 아래 숫자가 11개 이하인 실수 1개가 입력된다. (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +-
 * 1.7*10308 이다.)
 * 출력 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
 * 참고 %.11lf 를 사용하면 소수점 이하 11자리까지 출력된다.
 * 
 * 입력예시 : 3.14159265359 (float 범위 벗어남)
 * 출력예시 : 3.14159265359
 */

