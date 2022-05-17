package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1073 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기2(설명)
public class Code18 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			while(true) {
				if(data==0)break;
				System.out.println(data);
				data=Integer.parseInt(st.nextToken());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
