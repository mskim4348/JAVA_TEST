package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1083 : [기초-종합] 3 6 9 게임의 왕이 되자!(설명)
public class Code28 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			
			for(int i=1;i<=data;i++) {
				if(i%3==0) {
					System.out.print("X"+" ");
				}else {
					System.out.print(i+" ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
