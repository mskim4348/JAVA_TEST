package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code02 {
	public static void main(String[] args) {
		try {
			String msg=new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//1011:[����-�����] ���� 1�� �Է¹޾� �״�� ����ϱ�(����)
//������(char)���� ������ �ϳ� �����ϰ�, ������ ���ڸ� ������ ��
//������ ����Ǿ� �ִ� ���ڸ� �״�� ����غ���.
//����
//char x;
//scanf("%c", &x);
//printf("%c", x);
//�� ���� ������� �����ϴ�.
//
//�Է�
//���� 1���� �Էµȴ�.
//(��, �ԷµǴ� ���ڴ� ���ĺ� ��, �ҹ��� �� ���ڸ� ����� �ƽ�Ű�ڵ�� ǥ���� �� �ִ� ���ڵ鸸 �Էµȴ�.)
//���
//�Էµ� ���ڸ� �״�� ����Ѵ�.