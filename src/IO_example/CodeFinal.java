package IO_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeFinal {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			int data3=Integer.parseInt(st.nextToken());
			System.out.printf("%d",data1<data2?Math.min(data1, data3):Math.min(data2, data3));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
 * 
 * 세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
 * 
 * 입력 세 정수가 주어진다.
 * 출력 가장 작은 값을 출력한다.
 * 
 * 입력예시 3 5 2
 * 출력예시 2
 */