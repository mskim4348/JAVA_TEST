package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code08 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			String num=new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%02s",num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/* 1018: [����-�����] �ð� �Է¹޾� �״�� ����ϱ�(����)
 * 
 * � ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.
 * 
 * ���� scanf( ) �Լ��� ������ ����(format)�� ���� �Է¹޴� �Լ��̴�. ����, �Է¹ް��� �ϴ� �������� ǥ�����ָ� �ȴ�.
 * 
 * ���� scanf("%d:%d", &h, &m); //�ݷ�(:) ��ȣ�� �������� �� ���� �� ������ ����ȴ�.
 * 
 * �Է� ��(hour)�� ��(minute)�� ":" ���� ���еǾ� �Էµȴ�.
 * ��� �Է¹��� �ð��� "��:��" �������� ����Ѵ�.
 */