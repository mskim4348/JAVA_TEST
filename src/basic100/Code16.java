package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1071 : [����-�ݺ����౸��] 0 �Էµ� ������ ���� ����ϱ�1(����)
public class Code16 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data;
			for(;;) {
				data=Integer.parseInt(st.nextToken());
				if(data==0)break;
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
