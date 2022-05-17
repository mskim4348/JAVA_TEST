package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1082 : [기초-종합] 16진수 구구단?
public class Code27 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken(), 16);
			for(int i=1;i<=15;i++) {
				System.out.printf("%X*%X=%X\n", data,i,data*i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
