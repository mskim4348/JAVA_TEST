package IO_example;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code09 {
	public static void main(String[] args) {
		try {
			//split(".")인식 못함 \\역슬래쉬 두번 넣어줘야 인식
			String[] num=new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\.");
			
			System.out.printf("%04d.",Integer.parseInt(num[0]));
			for(int i=1;i<num.length-1;i++) {
				System.out.printf("%02d.",Integer.parseInt(num[i]));
			}
			System.out.printf("%02d",Integer.parseInt(num[num.length-1]));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/* 1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기 	
 * 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자. 
 * 
 * 입력 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
 * 출력 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다. (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우
 * 앞에 0을 붙여 출력한다.)
 */