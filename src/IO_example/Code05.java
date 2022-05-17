package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Code05 {
	public static void main(String[] args) {
		try {
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			String num[]=buff.readLine().split(" ");
			
			int a=num.length;
			for(int i=0;i<num.length;i++) {
				System.out.printf("%s ",num[a-1]);
				a--;
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
 * 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
 * 
 * 참고 char x, y; scanf("%c %c", &x, &y); printf("%c %c", y, x); //출력되는 순서를 작성 와
 * 같은 방법으로 해결할 수 있다.
 * 
 * 입력 2개의 문자가 공백으로 구분되어 입력된다.
 * 출력 두 문자의 순서를 바꿔 출력한다.
 */
