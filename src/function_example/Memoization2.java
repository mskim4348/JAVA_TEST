package function_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Memoization2 {
	public static void main(String[] args) {

		try {
			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int data1=Integer.parseInt(st.nextToken());
			int data2=Integer.parseInt(st.nextToken());
			int[][] data=new int[data1][data2];
			System.out.println(SuperSum(data,data1,data2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static int SuperSum(int[][] number,int a,int b) {
		if(a==1) {
			for(int i=0;i<b;i++) {
				number[a][i]=i+1;
			}
			return number[a][b-1];
		}
		for(int i=1;i<number[0].length;i++) {
			number[a][i]+=SuperSum(number,a,i);
		}
		return 0;
	}
}

/*
 * SuperSum 함수는 다음과 같이 정의된다.
 * 
 * SuperSum(0,n)=n (n은 모든 양의 정수)
 * 
 * SuperSum(k,n)=SuperSum(k−1,1)+SuperSum(k−1,2)+...+SuperSum(k−1,n) k와 n이 여러개
 * 주어진다. SuperSum의 값을 각각 출력하시오.
 * 
 * 입력 k(1<=k<=14)와 n(1<=n<=14)이 입력된다. 입력의 끝은 EOF(End Of File)이다. 입력 처리 방법)
 * while( scanf("%d %d", &k, &n) != EOF ) printf("%d\n", SuperSum(k, n));
 * 
 * 출력 SuperSum(k,n)의 값을 각 행에 하나씩 출력한다.
 * 
 * 입력예시 출력예시 1 3 6 2 3 10 4 10 2002 10 10 167960
 */
