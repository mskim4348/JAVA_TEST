package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code01 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d",Integer.parseInt(st.nextToken())==Integer.parseInt(st.nextToken())?0:1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/* 1052 : [����-�񱳿���] �� ���� �Է¹޾� ���ϱ�4(����)
 *
 * �� ����(a, b)�� �Է¹޾� a�� b�� ���� �ٸ��� 1��, �׷��� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
 * 
 * ���� � ���� ���ϱ� ���� ��/���迬����(comparison/relational)�� ����� �� �ִ�.
 * ��/���迬���ڴ� �־��� 2���� ���� ���Ͽ� �� ����� ���� ��� ��(true)�� ��Ÿ���� ������ 1�� ����ϰ�, ������ ���
 * ����(false)�� ��Ÿ���� ������ 0���� ����Ѵ�.
 * ��/���迬���ڵ� �Ϲ����� ��Ģ������ó�� �־��� �� ���� �̿��� ����� �����ϰ�, �� ����� 1(��), �Ǵ� 0(����)���� ����� �ִ�
 * �������̴�.
 * 
 * ��/���迬���ڴ� >, <, >=, <=, ==(����), !=(�ٸ���) 6���� �ִ�.
 * 
 * ���� printf("%d", 123!=123); //�� ������ !=�� ��� ����� 0(����)�� ��µȴ�.
 * 
 * �Է� �� ���� a, b�� ������ �ΰ� �Էµȴ�. -2147483647 <= a, b <= +2147483648
 * ��� a�� b�� �ٸ� ��� 1��, �׷��� ���� ��� 0�� ����Ѵ�.
 * 
 * �Է¿��� : 0 1
 * ��¿��� : 1
 */