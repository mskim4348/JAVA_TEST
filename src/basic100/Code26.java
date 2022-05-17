package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1081 : [기초-종합] 주사위를 2개 던지면?(설명)
public class Code26 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			for(int i=1;i<=data1;i++) {
				for(int j=1;j<=data2;j++) {
					System.out.println(i+" "+j);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
