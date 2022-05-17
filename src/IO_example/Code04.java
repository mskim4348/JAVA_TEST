package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Code04 {
	public static void main(String[] args) {
		try {
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			String num[]=buff.readLine().split(" ");
			
			for(int i=0;i<num.length;i++) {
				System.out.printf("%d ",Integer.parseInt(num[i]));
			}
//			Scanner scan=new Scanner(System.in);
//			int a=scan.nextInt();
//			int b=scan.nextInt();
//			System.out.printf("%d %d",a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
 * 정수(int) 2개를 입력받아 그대로 출력해보자.
 * 참고
 * 
 * int a, b; scanf("%d%d", &a, &b); //엔터/공백으로 입력 데이터가 구분되어 입력 printf("%d %d", a,
 * b);
 * 와 같은 방법으로 가능하다.
 * 
 * 입력 2개의 정수가 공백으로 구분되어 입력된다.
 * 출력 입력된 두 정수를 공백으로 구분하여 출력한다.
 */
