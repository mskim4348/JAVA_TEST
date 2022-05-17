package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code20 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%o",Integer.parseInt(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/* 1031 : [����-��º�ȯ] 10�� ���� 1�� �Է¹޾� 8������ ����ϱ�(����)
 * 
 * 10������ �Է¹޾� 8����(octal)�� ����غ���.
 * 
 * ���� %d(10���� ����)�� �Է¹ް�, %o�� ����� ����ϸ� 8����(octal)�� ��µȴ�.
 * 
 * �Է� 10���� 1���� �Էµȴ�. ��, �ԷµǴ� ������ int �����̴�.
 * ��� 8������ ����Ѵ�.
 * 
 * �Է¿��� : 10
 * ��¿��� : 12
 */