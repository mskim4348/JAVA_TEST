package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code24 {
	public static void main(String[] args) {
		try {
			String data = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%o", Integer.valueOf(data, 16));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1035 : [����-��º�ȯ] 16�� ���� 1�� �Է¹޾� 8������ ����ϱ�(����)
 * 
 * 16������ �Էµ� ���� 1���� 8������ �ٲپ� ����غ���.
 * 
 * ���� %x(������ �ҹ���) �� %X(������ �빮��)�� �Է� ������ 16������ �νĽ��� �����ų �� �ִ�. %o�� ����ϸ� 8������
 * ��µȴ�.
 * 
 * C���� �ҽ� �ڵ� �ۼ��� 0���� �����ϴ� ���� 8������ �νĵȴ�. ���� �ҽ��ڵ� ������ //�� �����ϸ� 1�� ������ ���� �� �ִ�.
 * ���� ���� ����(�ּ�) �� ���� ��� �� ���̿� �ۼ��ϸ� �ȴ�.
 * 
 * ���� int n; scanf("%x", &n); //�ҹ��ڷ� 16���� �Է� printf("%o", n);
 * 
 * �Է� 16�� ���� 1���� �Էµȴ�. (��, 16������ ���� �ҹ��ڷ� �Էµȴ�.)
 * ��� 8������ �ٲپ� ����Ѵ�
 * 
 * �Է¿��� f
 * ��¿��� 17
 */
