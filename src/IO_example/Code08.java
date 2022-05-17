package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code08 {
	public static void main(String[] args) {
		try {
//			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			String num=new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.printf("%02s",num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/* 1018: [기초-입출력] 시간 입력받아 그대로 출력하기(설명)
 * 
 * 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
 * 
 * 참고 scanf( ) 함수는 지정한 형식(format)에 따라 입력받는 함수이다. 따라서, 입력받고자 하는 형식으로 표현해주면 된다.
 * 
 * 예시 scanf("%d:%d", &h, &m); //콜론(:) 기호를 기준으로 두 수가 각 변수에 저장된다.
 * 
 * 입력 시(hour)와 분(minute)이 ":" 으로 구분되어 입력된다.
 * 출력 입력받은 시간을 "시:분" 형식으로 출력한다.
 */