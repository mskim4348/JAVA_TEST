package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1075 : [����-�ݺ����౸��] ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�2(����)
public class Code20 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			while(data>0) {
				data--;
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
