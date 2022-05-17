package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code07 {
	public static void main(String[] args) {
		
		try {
			StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int [] arr =new int[Integer.parseInt(st.nextToken())];
//			loop(2,Integer.parseInt(st.nextToken()),1,1); 이것도되는데 코드업 페이지는 작동안함
			arr[0]=1;
			fibo(1,1,arr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop(int a, int b,int c,int d) {
		if(a==b) {
			System.out.println(d);
		}else {
			int temp=d;
			d=d+c;
			c=temp;
			loop(++a,b,c,d);

		}
	}
	public static void fibo(int a,int b, int [] arr) {
		if(a==arr.length) {
			System.out.println(arr[arr.length-1]);
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
		}else {
			arr[a]=b%10009;
			b=b+arr[a-1];
			fibo(++a,b,arr);
		}
	}
}

/* 1916 : (재귀함수) 피보나치 수열 (Large)
 *
 * 피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
 * 
 * 첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.
 * 1,1,2,3,5,8,13…
 * 자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
 * 단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.
 * ※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.
 * 
 * 입력 자연수 N이 입력된다. (N은 200보다 같거나 작다.)
 * 출력 N번째 피보나치 수를 출력하되, 10,009를 나눈 나머지 값을 출력한다.
 * 
 * 입력예시 : 7
 * 출력예시 : 13
 */