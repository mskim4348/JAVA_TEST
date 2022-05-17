package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1071 : [기초-반복실행구조] 0 입력될 때까지 무한 출력하기1(설명)
public class Code16 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data;
			for(;;) {
				data=Integer.parseInt(st.nextToken());
				if(data==0)break;
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
