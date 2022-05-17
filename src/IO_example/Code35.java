package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code35 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			int data=Integer.parseInt(st.nextToken());
//			System.out.printf("%d\n",data<<1);
			System.out.printf("%d\n",Integer.parseInt(st.nextToken()) <<1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1047 : [����-��Ʈ����Ʈ����] ���� 1�� �Է¹޾� 2�� ���� ����ϱ�(����)
 *
 * ���� 1���� �Է¹޾� 2�� ���� ����غ���.
 * ���� 2 �� ���� ����ص� ������, ������ 2��� ���ϰų� ������ ����� �ִ� ��Ʈ��������Ʈ������ <<, >>�� �̿��Ѵ�.
 * 2���� ���·� ����Ǿ� �ִ� ������ ����(<<)�̳� ������(>>)���� ������ ��Ʈ ����ŭ �о��ָ� 2�辿 �þ�ų� ������ �پ��µ�,
 * ���� ��Ʈ����Ʈ(<<)�� �� ������ �����ʿ� 0�� �־��� ������ŭ �߰��ǰ�,
 * ������ ��Ʈ����Ʈ(>>)�� �� ������ ���ʿ� 0(0 �Ǵ� ���� ������ ���)�̳� 1(���� ������ ���)�� ������ŭ �߰��ȴ�.
 * ����(32��Ʈ)�� �Ѿ �̵��Ǵ� ��Ʈ�� �����ȴ�.
 * 
 * ���� int a=10; printf("%d", a<<1); //10�� 2�� �� ���� 20 �� ��µȴ�. printf("%d", a>>1);
 * //10�� ������ ���� ���� 5 �� ��µȴ�. printf("%d", a<<2); //10�� 4�� �� ���� 40 �� ��µȴ�.
 * printf("%d", a>>2); //10�� ������ ���� �� �ٽ� ������ ���� ���� 2 �� ��µȴ�.
 * 
 * �Է� ���� �� ���� �Էµȴ�. ��, -1073741824 ~ +1073741823
 * ��� 2�� ���� ������ ����Ѵ�.
 * 
 * �Է¿��� 1024
 * ��¿��� 2048
 */
