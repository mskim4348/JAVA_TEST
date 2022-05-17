package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code23 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%d",Integer.valueOf(data, 8));
//			System.out.println(Integer.valueOf(data, 2));
//			System.out.printf("%d\n",Integer.valueOf(data, 8));
//			System.out.printf("%d\n",Integer.valueOf(data, 10));
//			System.out.printf("%d\n",Integer.valueOf(data, 16));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * 8������ �Էµ� ���� 1���� 10������ �ٲپ� ����غ���.
 * 
 * ���� %o�� �Է¹����� 8������ �νĽ��� �����ų �� �ִ�. %d�� ����ϸ� 10������ ��µȴ�.
 * 
 * ���� int n; scanf("%o", &n); printf("%d", n); (C���� �ҽ� �ڵ� �ۼ� �� 0���� �����ϴ� ����
 * 8������ �νĵȴ�. int a = 013; // 10���� 11�� ���� ��)
 * 
 * �Է� 8�� ���� 1���� �Էµȴ�. 
 * ��� 10������ �ٲپ� ����Ѵ�.
 * �Է¿��� : 13
 * ��¿��� : 11
 */


