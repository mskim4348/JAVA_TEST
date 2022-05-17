package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code08 {
	public static void main(String[] args) {
		
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data=Integer.parseInt(st.nextToken());
			if(data==0||data==1) {
				System.out.println(data);
			}else {
				System.out.println(loop(data));  
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String loop(int a) {
		int mok=a/2;
		if(mok==1) {
			return mok+""+a%2;  
		}else {
			return loop(mok)+""+a%2;
		}
	}
}

/* 1920 : (재귀함수) 2진수 변환
 *
 * 어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
 * 
 * 예)
 * 10 -----> 1010
 * 0 -----> 0
 * 1 -----> 1
 * 2 -----> 10
 * 1024 -----> 10000000000
 * 이 문제는 반복문을 이용하여 풀 수 없습니다.
 * 
 * 입력 10진수 정수 n이 입력된다.(0<=n<=2,100,000,000) 
 * 출력 2진수로 변환해서 출력한다.
 * 
 * 입력예시: 7
 * 출력예시: 111
 */