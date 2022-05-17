package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기(설명)
public class Code17 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
			int data=Integer.parseInt(line.trim());
			String[] arr = new String[data];
			arr = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
//			loop(0,data,arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void loop(int a,int b,String[] arr) {
//		if(a==(b-1)) {
		if(a==arr.length-1) {
			System.out.println(arr[a]);
		}else {
			System.out.println(arr[a]);
			loop(++a,b,arr);
		}
	}
}
