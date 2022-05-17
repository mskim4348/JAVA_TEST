package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code34 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			long data=0;
			data+=Integer.parseInt(st.nextToken());
			data+=Integer.parseInt(st.nextToken());
			data+=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d\n",data);
			System.out.printf("%1.1f\n",(float)data/3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1046 : [����-�������] ���� 3�� �Է¹޾� �հ� ��� ����ϱ�	
 *
 * ���� 3���� �Է¹޾� �հ� ����� ����غ���. ��, -2147483648 ~ +2147483647
 * 
 * �Է� ���� 3���� ������ �ΰ� �Էµȴ�. ��, -2147483648 ~ +2147483647
 * ��� �հ� ����� ���� �ٲ� ����Ѵ�. ����� �Ҽ��� ���� ��° �ڸ����� �ݿø��ؼ� �Ҽ��� ���� ù° �ڸ����� ����Ѵ�.
 * 
 * �Է¿��� : 1 2 3
 * ��¿��� : 6
 * 		    2.0
 */