package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1059 : [����-��Ʈ����������] ��Ʈ������ NOT �Ͽ� ����ϱ�(����)
public class Code08 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			int data1=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",~Integer.parseInt(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
