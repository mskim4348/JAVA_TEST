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
 * ����(int) 2���� �Է¹޾� �״�� ����غ���.
 * ����
 * 
 * int a, b; scanf("%d%d", &a, &b); //����/�������� �Է� �����Ͱ� ���еǾ� �Է� printf("%d %d", a,
 * b);
 * �� ���� ������� �����ϴ�.
 * 
 * �Է� 2���� ������ �������� ���еǾ� �Էµȴ�.
 * ��� �Էµ� �� ������ �������� �����Ͽ� ����Ѵ�.
 */
