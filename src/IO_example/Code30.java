package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code30 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			System.out.printf("%1.0f",(float)(data1/data2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * ���� 2��(a, b) �� �Է¹޾� a�� b�� ���� ���� ����غ���. ��, -2147483648 <= a <= b <=
 * +2147483647, b�� 0�� �ƴϴ�.
 * ���� C���� ����/���� ������ ����� ����(��)�� ���ȴ�. �Ǽ�/����, ����/�Ǽ�, (float)����/����, ����/(float)����
 * ���� ���� ����� �Ǽ� ������ ���ȴ�.
 * 
 * (float)(����/����)�� ����/������ ����� ���� ���� �Ǽ���(float)�� �ٲٴ� ������, ��� ����� ���� ���� �Ǽ� ���·�
 * ��ȯ�Ǵ� ���̴� �����ؾ� �Ѵ�.
 * 
 * ����/�Ǽ� ������� �ڵ����� �Ǽ������� �ٲ�� ���� ������ (������)����ȯ�̶�� �ϰ�, � ���̳� ����� ���������� ������ �ٲٴ� ����
 * ����� (������)����ȯ�̶�� �Ѵ�.
 * 
 * int a; scanf("%d", &a); printf("%f", (float)a);
 * �� ���� �����ϸ�, ������ ����Ǿ� �ִ� ���� �Ǽ���(float)���� ��������� ��ȯ�Ͽ� ����Ѵ�.
 * 
 * �Է� ���� 2��(a, b)�� ������ �ΰ� �Էµȴ�. ��, -2147483648 <= a <= b <= +2147483647
 * ��� a�� b�� ���� ���� ����Ѵ�.
 * 
 * �Է¿��� 1 3
 * ��¿��� 0
 */