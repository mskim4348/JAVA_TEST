package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1066 : [����-����/���ý��౸��] ���� 3�� �Է¹޾� ¦/Ȧ ����ϱ�(����)
public class Code12 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			int data3=Integer.parseInt(st.nextToken());
			
			if(data1%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			if(data2%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			if(data3%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
