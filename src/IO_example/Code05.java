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
 * 2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.
 * 
 * ���� char x, y; scanf("%c %c", &x, &y); printf("%c %c", y, x); //��µǴ� ������ �ۼ� ��
 * ���� ������� �ذ��� �� �ִ�.
 * 
 * �Է� 2���� ���ڰ� �������� ���еǾ� �Էµȴ�.
 * ��� �� ������ ������ �ٲ� ����Ѵ�.
 */
