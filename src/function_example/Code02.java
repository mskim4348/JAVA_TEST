package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code02 {
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
			System.out.println(b);
			loop(a, --b);
		}
	}
}

/* 1902 : (��� �Լ�) 1���� n���� �������� ����ϱ�
 * 
 * ���� n���� 1���� ����ϴ� ����Լ��� �����Ͻÿ�.
 * 
 * �� ������ �ݺ��� for, while ���� �̿��Ͽ� Ǯ�� �����ϴ�.
 * 
 * ���� Ű���� : for while goto
 * 
 * �Է� ���� n�� �Էµȴ�(1<=n<=200) 
 * ��� n���� 1���� �� �ٿ� �ϳ��� ����Ѵ�.
 * �Է�:10
 * ��� 10~1����
 */