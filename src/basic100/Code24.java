package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1079 : [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
public class Code24 {
	public static void main(String[] args) {
		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			String data;
			while(true) {
				data=st.nextToken();
				System.out.println(data);
				if(data.equals("q")) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
