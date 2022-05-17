package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code33 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			System.out.printf("%d\n", data1+data2);
			System.out.printf("%d\n", data1-data2);
			System.out.printf("%d\n", data1*data2);
			System.out.printf("%d\n", data1/data2);
			System.out.printf("%d\n", data1%data2);
			System.out.printf("%1.2f\n", (float)data1/data2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1045 : [����-�������] ���� 2�� �Է¹޾� �ڵ� ����ϱ�1045 : [����-�������] ���� 2�� �Է¹޾� �ڵ� ����ϱ�
 * 
 * ���� 2��(a, b)�� �Է¹޾� ��, ��, ��, ��, ������, ���� ���� �ڵ����� ����غ���. �� 0 <= a, b <=
 * 2147483647, b�� 0�� �ƴϴ�.
 * 
 * �Է� ���� 2���� ������ �ΰ� �Էµȴ�.
 * 
 * 
 * ��� ù �ٿ� �� ��° �ٿ� ��, ��° �ٿ� ��, ��° �ٿ� ��, �ټ�° �ٿ� ������, ����° �ٿ� ���� ���� ������� ����Ѵ�. (�Ǽ�,
 * �Ҽ��� ���� ��° �ڸ����� �ݿø��� ��° �ڸ����� ���)
 * 
 * �Է¿��� 10 3
 * ��� ���� 
 * 13 
 * 7
 * 30
 * 3
 * 1
 * 3.33
 */
