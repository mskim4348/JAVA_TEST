package basic100;

import java.util.Scanner;

//1072 : [����-�ݺ����౸��] ���� �Է¹޾� ��� ����ϱ�(����)
public class Code17_answer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine().trim();
		String[] k = sc.nextLine().split(" ");
		int i = 0;
		int c = Integer.parseInt(b);
		run(k, c, i);
	}

	private static int run(String[] k, int c, int i) {
		if (i != c) {
			int a = Integer.parseInt(k[i]);
			System.out.println(a);
			i = i + 1;
			return run(k, c, i);
		} else {
			return 0;
		}
	}
}
