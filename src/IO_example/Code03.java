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
 * �Ǽ���(float)�� ������ �����ϰ� �� ������ �Ǽ����� ������ �� ����Ǿ� �ִ� �Ǽ����� ����غ���.
 * 
 * ���� float x; scanf("%f", &x); printf("%f", x); �� ���� ������� �����ϴ�.
 *  
 * �Է� �Ǽ��� 1���� �Էµȴ�. (��, float�� ������ �� �ִ� �Ǽ� ���� �Էµȴ�.)
 * ��� �Էµ� �Ǽ����� �״�� ����Ѵ�.
 */