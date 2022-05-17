package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code17 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%d",Long.parseLong(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/* 1028 : [����-��������] ���� 1�� �Է¹޾� �״�� ����ϱ�2(����)
 * 
 * ���� 1���� �Է¹޾� �״�� ����غ���. (��, �ԷµǴ� ������ ������ 0 ~ 4,294,967,295 �̴�.)
 * 
 * ���� -2147483648 ~ +2147483647 ������ ������ �����ϰ� ó���ϱ� ���ؼ��� int ������ ������ �����ϸ� �ȴ�.(int
 * �� �����ϰ� %d�� �ް� ���)
 * ������ �� ������ �Ѿ�� ������ �����ϱ� ���ؼ��� ���� ū ������ ������ �� �ִ� �ٸ� ���������� ����ؾ� ���������� �����ų �� �ִ�.
 * unsigned int ���������� ����ϸ� 0 ~ 4294967295 ������ ������ ������ �� �ִ�.
 * ���� unsigned int n; scanf("%u", &n); printf("%u", n);
 * 
 * �Է� ���� 1���� �Էµȴ�. (��, �ԷµǴ� ������ ������ 0 ~ 4294967295 �̴�.)
 * ��� �Էµ� ������ �״�� ����Ѵ�.
 * 
 * �Է¿��� : 2147483648(int ���� ���)
 * ��¿��� : 2147483648
 */
