package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code29 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.printf("%c",(st.nextToken().charAt(0))+1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1041 : [����-�������] ���� 1�� �Է¹޾� ���� ���� ����ϱ�(����)
 *
 * ������ 1���� �Է¹޾� �� ���� ���ڸ� ����غ���.
 * ������ 'A'�� ���� ���ڴ� 'B'�̰�, ������ '0'�� ���� ���ڴ� '1'�̴�.
 * ���� ���ڴ� ���� ǥ���ϴ� ���ڷμ� '0' �� ���� �� ��ü�� �ǹ��ϰ�, 0�� ���� �ǹ��Ѵ�.
 * ��Ʈ �ƽ�Ű����ǥ���� 'A'�� 10���� 65�� ����ǰ� 'B'�� 10���� 66���� ����ȴ�. ���� ���ڵ� ������ ������ �� �� �ִ�.
 * 
 * �Է� ������ 1���� �Էµȴ�.
 * ��� ���� ���ڸ� ����Ѵ�.
 * 
 * �Է¿��� a
 * ��¿��� b
 */