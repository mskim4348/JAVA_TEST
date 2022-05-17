package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code38 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%d\n",Integer.parseInt(st.nextToken())==Integer.parseInt(st.nextToken())?1:0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1050 : [����-�񱳿���] �� ���� �Է¹޾� ���ϱ�2(����)
 * 
 * �� ����(a, b)�� �Է¹޾� a�� b�� ������ 1��, ���� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
 * ���� � ���� ���ϱ� ���� ��/���迬����(comparison/relational)�� ����� �� �ִ�.
 * 
 * ��/���迬���� == �� �� ���� ���� ���� ��� ��(true)�� ��Ÿ���� ������ 1�� ����ϰ�, �ٸ� ��� ����(false)�� ��Ÿ����
 * ������ 0���� ����Ѵ�.
 * ��/���迬���ڵ� �Ϲ����� ��Ģ������ó�� �־��� �� ���� �̿��� ����� �����ϰ�, �� ����� 1(��), �Ǵ� 0(����)���� ����� �ִ�
 * �������̴�.
 * ��/���迬���ڴ� >, <, >=, <=, ==(����), !=(�ٸ���) 6���� �ִ�.
 ** 
 * ���п��� ���ʰ� �������� ��� ����� ����(��ġ)�� ��Ÿ���� ��ȣ = �� C���� ���� �ٸ� �ǹ̷� ���ȴ�.
 * 
 * a=1 �� ���� ǥ���� a�� 1�� ���� ���ٴ� �ǹ̰� �ƴ϶� �������� ��� ����� 1�� ������ ���� a�� �����϶�� �ǹ��̴�.
 * 
 * �Է� �� ���� a, b�� ������ �ΰ� �Էµȴ�. -2147483648 <= a, b <= +2147483647
 * ��� a�� b�� ���� ���� ��� 1��, �׷��� ���� ��� 0�� ����Ѵ�.
 * 
 * �Է¿��� 0 0 
 * ��¿��� 1
 */