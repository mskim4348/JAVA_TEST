package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code09 {
	public static void main(String[] args) {
		try {
			//split(".")�ν� ���� \\�������� �ι� �־���� �ν�
			String[] num=new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\.");
			
			System.out.printf("%04d.",Integer.parseInt(num[0]));
			for(int i=1;i<num.length-1;i++) {
				System.out.printf("%02d.",Integer.parseInt(num[i]));
			}
			System.out.printf("%02d",Integer.parseInt(num[num.length-1]));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1019 : [����-�����] ������ �Է¹޾� �״�� ����ϱ� 	
 * ��, ��, ���� �Է¹޾� ������ �������� ����ϴ� ������ �غ���. 
 * 
 * �Է� ��, ��, ���� ".(��)"���� ���еǾ� �Էµȴ�.
 * ��� �Է¹��� ��, ��, ���� yyyy.mm.dd �������� ����Ѵ�. (%02d�� ����ϸ� 2ĭ�� ����� ����ϴµ�, �� �ڸ� ���� ���
 * �տ� 0�� �ٿ� ����Ѵ�.)
 */