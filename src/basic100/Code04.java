package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1055 : [����-������] �ϳ��� ���̸� �� ����ϱ�(����)
public class Code04 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",data1==1|| data2==1?1:0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
