package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1078 : [기초-종합] 짝수 합 구하기(설명)
public class Code23 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			int sum=0;
			for(int i=0;i<=data;i++) {
				if(i%2==0)sum+=i;
			}
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
