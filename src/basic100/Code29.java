package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//1084 : [기초-종합] 빛 섞어 색 만들기(설명)
public class Code29 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String data[] =buff.readLine().split(" ");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int cnt = 0;
			for (int i = 0; i < Integer.parseInt(data[0]); i++) {
				for (int j = 0; j < Integer.parseInt(data[1]); j++) {
					for (int k = 0; k < Integer.parseInt(data[2]); k++) {
						bw.write(i + " " + j + " " + k + "\n");
						cnt++;
					}
				}
			}
			bw.write(String.valueOf(cnt));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
