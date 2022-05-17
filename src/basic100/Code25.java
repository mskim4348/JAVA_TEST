package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1080 : [기초-종합] 언제까지 더해야 할까?
public class Code25 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			int data=Integer.parseInt(st.nextToken());
			int sum=0;
			for(int i=1;;i++) {
				sum+=i;
				if(sum>=data) {
					System.out.println(i);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
