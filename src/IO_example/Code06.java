package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code06 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
//			String num=buff.readLine();
			System.out.printf("%.2f ",Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
 * �Ǽ�(float) 1���� �Է¹޾� ������ ��, ����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ�����
 * ����Ͻÿ�.
 * 
 * ���� %.3f �� ���� �������� �����ϸ�, �Ҽ��� ���� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����϶�� �ǹ��̴�.
 * 
 * �Է� �Ǽ� 1���� �Էµȴ�.
 * ��� ����� �Ҽ��� �� ° �ڸ����� �ݿø� ��, �Ҽ��� ���� ��° �ڸ����� ����Ѵ�. (%.2f�� �̿��ϸ� �ȴ�.)
 */