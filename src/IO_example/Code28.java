package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code28 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			System.out.printf("%d", -Integer.parseInt(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1040 : [����-�������] ���� 1�� �Է¹޾� ��ȣ �ٲ� ����ϱ�(����)
 * 
 * �Էµ� ������ ��ȣ�� �ٲ� ����غ���. ��, -2147483647 ~ +2147483647 ������ ������ �Էµȴ�.
 * 
 * ���� ���� �������� -(negative)�� ���� �տ� ���̸� ��ȣ�� �ݴ�� �ٲ�� ���ȴ�.
 * 
 * ���� int a; scanf("%d", &a); printf("%d", -a);
 * 
 * �Է� ���� 1���� �Էµȴ�.
 * ��� ��ȣ�� �ٲ� ����Ѵ�.
 * 
 * �Է¿��� : -1
 * ��¿��� : 1
 */