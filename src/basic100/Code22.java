package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1077 : [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기(설명)
public class Code22 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<=data;i++) {
				System.out.println(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
