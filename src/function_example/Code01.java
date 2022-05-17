package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code01 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int a=1;
			
			loop(a,Integer.parseInt(st.nextToken()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b) {
		if(a<=b) {
			System.out.println(a);
			loop(++a, b);
		}
	}
}

/* 1901 : (��� �Լ�) 1���� n���� ����ϱ�
 *
 * 1 ���� ���� n���� ����ϴ� ����Լ��� �����Ͻÿ�.
 * 
 * �� ������ �ݺ��� for, while ���� �̿��Ͽ� Ǯ�� �����ϴ�.
 * 
 * �Է� ���� n�� �Էµȴ�(1<=n<=200) 
 * ��� 1���� n���� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * �Է¿��� 10
 * ��¿��� 1
 */