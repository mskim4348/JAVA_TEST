package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code04 {
	public static void main(String[] args) {
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			loop(1,Integer.parseInt(st.nextToken()),0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b, int sum) {
		if(a<=b) {
			sum+=a;
			loop(++a, b, sum);
		}else {
			System.out.println(sum);
		}
	}
}

/* 1904 : (재귀함수) 두 수 사이의 홀수 출력하기
 *
 * 시작수(a)와 마지막 수(b)가 입력되면
 * 
 * a부터 b까지의 모든 홀수를 출력하시오.
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 * 금지 키워드 : for while goto
 * 
 * 입력 두 수 a, b 가 입력된다. (1<=a<=b<=100)
 * 출력 a~b의 홀수를 모두 출력한다.
 * 
 * 입력예시 : 2 7
 * 출력예시 : 3 5 7
 */