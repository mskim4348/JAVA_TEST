package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code32 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			long data=Integer.parseInt(st.nextToken());
			System.out.printf("%d", ++data);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1044 : [����-�������] ���� 1�� �Է¹޾� 1 ���� ����ϱ�(����)
 * 
 * ������ 1�� �Է¹޾� 1��ŭ ���� ����غ���. ��, -2147483648 ~ +2147483647 �� ������ �Էµȴ�.
 * 
 * ���� ���ǰ� �� ���� ���� ����(��������)�� �����Ѵ�.
 * 
 * ���� � ����(a)�� ���� ������ �� a+1 �� ���� ����� ���� �ְ�, ++a ������ �� �Ŀ� ����� ���� �ִ�.
 * 
 * ++a, --a, a++, a-- �� ���� � ������ ���̳� �ڿ� �ٿ� ������ ����Ǿ��ִ� ���� 1��ŭ ���ϰų� ���ִ� �����ڸ�
 * ���������ڶ�� �Ѵ�.
 * 
 * ���������ڸ� ���� �տ� ���̸� �� ������ ����ϱ� ���� ������ ���� �����ϰ�, ���������ڸ� ���� �ڿ� ���̸� �ϴ� ������ ����Ǿ��ִ� ����
 * ���� ����ϰ� �� �� ���߿� ������ �����Ѵ�.
 * 
 * �Է� ���� 1���� �Էµȴ�. ��, -2147483648 ~ +2147483647 �� ������ �Էµȴ�.
 * ��� �Էµ� ������ 1�� ���� ����Ѵ�.
 * 
 * �Է¿��� : 2147483647
 * ��¿��� : 2147483648
 */
