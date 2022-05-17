package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1053 : [����-������] �� ���� �ٲٱ�(����) 
public class Code02 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",data==1?0:1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
 * 1(true, ��) �Ǵ� 0(false, ����) �� �ԷµǾ��� �� �ݴ�� ����ϴ� ���α׷��� �ۼ��غ���.
 * 
 * ���� C���� ��/���� ����(==, !=, >, <, >=, <=)�� ����� ��, 0�� ����(false)���� �νĵǰ�, 0�� �ƴ� ���
 * ���� ��(true)���� �νĵȴ�.
 * �� �Ǵ� ������ ������ ��(�ݴ�)���� �ٲٱ� ���ؼ��� ��(logical)������ !�� ����� �� �ִ�.
 * �̷��� �������� NOT �����̶�� �θ���, ������(��ȣ �����ʿ� ����ǥ) �̳� ��(��ȣ ���� ���� ����)�� ǥ���ϰ�, ���� ��ȣ�δ� c
 * (������, complement)�� �ǹ��Ѵ�. ��� ���� �ǹ��̴�.
 * ��, ������ ����(boolean value)�� �� ���� �ٷ���ִ� �������ڴ� !(not), &&(and), ||(or) �� �ִ�.
 * �� ���(boolean algebra)�� ������ ���� ���� ������ ��/������ ������ ������ �� ������ �ٷ��.
 * 
 * ���� printf("%d", !0); //������ �ݴ�, �� ���� 1�� ���� printf("%d", !1); //���� �ݴ�, �� ������
 * 0���� ���� printf("%d", !999); //���� �ݴ�, �� ������ 0���� ����
 * � ���� a��, !a �� ���� �� ������ �����ϴ�.
 * 
 * �Է� ���� 1���� �Էµȴ�.(��, 0 �Ǵ� 1 �� �Էµȴ�.)
 * ��� �Էµ� ���� 0�̸� 1, 1�̸� 0�� ����Ѵ�.
 */