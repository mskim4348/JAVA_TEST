package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1077 : [����-�ݺ����౸��] ���� 1�� �Է¹޾� �� ������ ����ϱ�(����)
public class Code21 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=st.nextToken().charAt(0);
			int data1=(char)'a';
//			System.out.printf("%d ",data);
//			System.out.println((char)data1);
//			System.out.println((int)data1);
			while(data1<=data) {
				System.out.printf("%c ",data1);
				data1++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
