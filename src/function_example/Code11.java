package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code11 {
	public static void main(String[] args) {

		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			loop(Integer.parseInt(st.nextToken()),0,1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void loop(int data,int a,int b) {
		if(data==b) {
			if(a==b) {
				System.out.println();
			}else {
				System.out.print("*");
				loop(data,++a,b);
			}
		}else {
			if(a==b) {
				System.out.println();
				loop(data,0,++b);
			}else {
				System.out.print("*");
				loop(data,++a,b);
			}
		}
	}
}

/*
 * n 이 입력되면 다음과 같은 삼각형을 출력하시오.
 * 예)
 * n 이 5 이면
 *
 **
 ***
 ****
 *****
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 * 
 * 입력 길이 n이 입력된다.(1<=n<=150)
 * 출력 삼각형을 출력한다.
 * 
 * 입력예시 3
 * 출력예시:
	 *  
	 **
	 ***
 */