package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code37 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d\n",Integer.parseInt(st.nextToken())<=Integer.parseInt(st.nextToken())?0:1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1049 : [����-�񱳿���] �� ���� �Է¹޾� ���ϱ�1(����)
 * 
 * �� ����(a, b)�� �Է¹޾�
 * a�� b���� ũ�� 1��, a�� b���� �۰ų� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
 * ���� � ���� ���ϱ� ���� ��/���迬����(comparison/relational)�� ����� �� �ִ�.
 * 
 * ��/���迬���� > �� ������ ���� ������ �� ���� ū ��� ��(true)�� ��Ÿ���� ������ 1�� ����ϰ�, �� ���� ��쿡��
 * ����(false)�� ��Ÿ���� ������ 0���� ����Ѵ�.
 * ��/���迬���ڵ� �Ϲ����� ��Ģ������ó�� �־��� �� ���� �̿��� ����� �����ϰ�, �� ����� 1(��), �Ǵ� 0(����)���� ����� �ִ�
 * �������̴�.
 * ��/���迬���ڴ� >, <, >=, <=, ==(����), !=(�ٸ���) 6���� �ִ�.
 * ���� printf("%d", 123<456); //�� ������ < �� ��� ����� 1(��)�� ��µȴ�.
 * 
 * �Է� �� ���� a, b�� ������ �ΰ� �Էµȴ�. -2147483648 <= a, b <= +2147483647
 * ��� a�� b���� ū ��� 1��, �׷��� ���� ��� 0�� ����Ѵ�.
 * �Է¿��� : 9 1
 * ��¿��� : 1
 */