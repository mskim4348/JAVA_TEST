package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1077 : [����-�ݺ����౸��] ���� 1�� �Է¹޾� �� ������ ����ϱ�(����)
public class Code22 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<=data;i++) {
				System.out.println(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
