package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1088 : [기초-종합] 3의 배수는 통과?(설명)
public class Code33 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			int data =Integer.parseInt(buff.readLine());
			for(int i=1;i<=data;i++) {
				if(i%3!=0)System.out.print(i+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
