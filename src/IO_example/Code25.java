package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code25 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			
			System.out.printf("%c", Integer.parseInt(data));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1037 : [����-��º�ȯ] ���� �Է¹޾� �ƽ�Ű ���ڷ� ����ϱ�
 * 
 * 10�� ���� 1���� �Է¹޾� �ƽ�Ű ���ڷ� ����غ���. ��, 0 ~ 255 ������ ������ �Էµȴ�.
 * 
 * �Է� 10�� ���� 1��(0 ~ 255 ����)�� �Էµȴ�.
 * ��� �ƽ�Ű�ڵ� ���� ���ڷ� ����Ѵ�
 * �Է¿��� : 65
 * ��¿��� : A
 */