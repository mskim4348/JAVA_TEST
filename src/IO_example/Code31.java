package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code31 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			System.out.printf("%d",data1%data2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1043 : [����-�������] ���� 2�� �Է¹޾� ���� ������ ����ϱ�(����)
 * 
 * ���� 2��(a, b) �� �Է¹޾� a�� b�� ���� �������� ����غ���. ��, 0 <= a, b <= +2147483647, b�� 0��
 * �ƴϴ�.
 * ���� C���� ����%���� ������ ����� ���� �������� ���ȴ�.
 * % ������(modulus, mod ����) ������ ���콺�� �����س� ��������, � ������ �ٸ� ������ ������ �� �� ���� �������� ����ϴ�
 * �����̴�.
 * ��, ��(-)�� �ƴ� ������ ���ؼ��� ����ȴ�.
 * 
 * �Է� ���� 2��(a, b)�� ������ �ΰ� �Էµȴ�. ��, 0 <= a, b <= +2147483647, b�� 0�� �ƴϴ�.
 * ��� a �� b�� ���� �������� ����Ѵ�.
 * 
 * �Է¿��� 10 3
 * ��¿��� 1
 */