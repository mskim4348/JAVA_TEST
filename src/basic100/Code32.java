package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1087 : [����-����] �������! ���� �׸�~(����)
public class Code32 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			int data =Integer.parseInt(buff.readLine());
			int sum=0;
			for(int i=1;;i++) {
				if(data<=sum) {
					System.out.println(sum);
					break;
				}
				sum+=i;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
