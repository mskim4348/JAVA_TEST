package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code04 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			loop(1,Integer.parseInt(st.nextToken()),0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b, int sum) {
		if(a<=b) {
			sum+=a;
			loop(++a, b, sum);
		}else {
			System.out.println(sum);
		}
	}
}

/* 1904 : (����Լ�) �� �� ������ Ȧ�� ����ϱ�
 *
 * ���ۼ�(a)�� ������ ��(b)�� �ԷµǸ�
 * 
 * a���� b������ ��� Ȧ���� ����Ͻÿ�.
 * �� ������ �ݺ��� for, while ���� �̿��Ͽ� Ǯ�� �����ϴ�.
 * ���� Ű���� : for while goto
 * 
 * �Է� �� �� a, b �� �Էµȴ�. (1<=a<=b<=100)
 * ��� a~b�� Ȧ���� ��� ����Ѵ�.
 * 
 * �Է¿��� : 2 7
 * ��¿��� : 3 5 7
 */