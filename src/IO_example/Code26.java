package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code26 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			System.out.printf("%d", Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * ���� 2���� �Է¹޾� ���� ����ϴ� ���α׷��� �ۼ��غ���. (��, �ԷµǴ� ������ -1073741824 ~ 1073741824 �̴�.)
 * 
 * �Է� 2���� ������ �������� ���еǾ� �Էµȴ�. ���� : ����� ����� int ������ �Ѿ������ �� ������ ���ƾ� �Ѵ�.
 * ��� �� ������ ���� ����Ѵ�
 * 
 * �Է¿��� : 123-123
 * ��¿��� : 0
 */