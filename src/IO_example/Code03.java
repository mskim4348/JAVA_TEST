package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		try {
//			float msg=Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			System.out.printf("%f\n",msg);
			System.out.printf("%f\n",Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Scanner scan=new Scanner(System.in);
//		float msg=scan.nextFloat();
//		scan.close();
//		System.out.printf("%f\n", msg);
	}
}

/*
 * 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
 * 
 * 참고 float x; scanf("%f", &x); printf("%f", x); 와 같은 방법으로 가능하다.
 *  
 * 입력 실수값 1개가 입력된다. (단, float로 저장할 수 있는 실수 값만 입력된다.)
 * 출력 입력된 실수값을 그대로 출력한다.
 */