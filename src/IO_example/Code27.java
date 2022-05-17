package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code27 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			System.out.printf("%d", Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1039 : [����-�������] ���� 2�� �Է¹޾� �� ����ϱ�2(����)
 *
 * ���� 2���� �Է¹޾� ���� ����غ���. ��, �ԷµǴ� ������ -2147483648 ~ +2147483648 �̴�.
 * 
 * ���� + �����ڸ� ����ϸ� �ȴ�. ��, ���� ����� int ������ ������ �� �ִ� ������ �Ѿ �� �ֱ� ������ �ٸ� ���������� ����ؾ�
 * �Ѵ�.
 * 
 * ���� int ���������� %d�� ������ϰ�, long long int ���������� %lld�� ������Ѵ�
 * 
 * �Է� 2���� ������ �������� ���еǾ� �Էµȴ�.
 * ��� �� ������ ���� ����Ѵ�.
 * 
 * �Է¿��� 2147483648 2147483648
 * ��¿��� 4294967296 
 */