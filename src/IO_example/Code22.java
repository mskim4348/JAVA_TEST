package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code22 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
//			System.out.printf("%X",Integer.parseInt(data));
			System.out.printf(Integer.toString(Integer.parseInt(data), 16).toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/* 1033 : [����-��º�ȯ] 10�� ���� �Է¹޾� 16������ ����ϱ�2(����)
 * 
 * 10������ �Է¹޾� 16����(hexadecimal)�� ����غ���.
 * 
 * ���� %d(10���� ����)�� �Է¹ް� %X�� ����ϸ� 16����(hexadecimal) �빮�ڷ� ��µȴ�.
 * 
 * 10������ �� �ڸ��� 10��(0 1 2 3 4 5 6 7 8 9)�� ���ڸ� ����ϰ�, 16������ �� �ڸ��� 16��(0 1 2 3 4 5 6
 * 7 8 9 A B C D E F)�� ���ڸ� ����Ѵ�. (���ĺ� ��ҹ��ڴ� ǥ���� �ٸ��� ���� ���� �ǹ��Ѵ�.) 16������ A�� 10������
 * 10, B�� 11, C�� 12 ... �� ����.
 * 
 * �Է� 10���� 1���� �Էµȴ�.
 * ��� 16����(�빮��)�� ����Ѵ�.
 * 
 * �Է¿��� : 255
 * ��¿��� : FF
 */

