package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1059 : [기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기(설명)
public class Code08 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			int data1=Integer.parseInt(st.nextToken());
			
			System.out.printf("%d",~Integer.parseInt(st.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
