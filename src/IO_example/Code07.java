package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code07 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d %d %d",num,num,num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/* 1017 : [����-�����] ���� 1�� �Է¹޾� 3�� ����ϱ�(����)
 *
 * int�� ���� 1���� �Է¹޾� ������ ���̿� �ΰ� 3�� ����غ���.
 * 
 * ���� printf("%d %d %d", a, a, a); �� ���� ������� ����� �� �ִ�.
 * 
 * �Է� ���� 1���� �Էµȴ�.
 * ��� �Է¹��� ������ �������� ������ 3�� ����Ѵ�.
 */