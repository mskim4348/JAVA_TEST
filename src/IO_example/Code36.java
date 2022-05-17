package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code36 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d\n",Integer.parseInt(st.nextToken()) << Integer.parseInt(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1048 : [����-��Ʈ����Ʈ����] �� ���� 2�� �ŵ����� ��� ����ϱ�(����)
 *
 * ���� 2��(a, b)�� �Է¹޾� a�� 2b�� ���� ������ ����غ���. 0 <= a <= 10, 0 <= b <= 10
 * 
 * 
 * ���� ���� ��� 1 3 �� �ԷµǸ� 1�� 23(8)�� �Ͽ� ����Ѵ�.
 * 
 * ���� int a=1, b=10; printf("%d", a << b); //210 = 1024 �� ��µȴ�.
 * 
 * �Է� ���� 2���� ������ �ΰ� �Էµȴ�. 0 <= a, b <= 10
 * ��� a �� 2b�� ��ŭ ���� ���� ����Ѵ�.
 * 
 * �Է¿��� : 1 3
 * ��¿��� : 8
 */
