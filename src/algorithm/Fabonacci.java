package algorithm;

public class Fabonacci {
	public static void main(String[] args) {
		//function_example Code06,Code07 class »Æ¿Œ
		System.out.println(fibo(7)%10009);
	}
	public static int fibo(int n) {
		if(n<=1)
			return n;
		else 
			return fibo(n-2)+fibo(n-1);
	}
}

