package algorithm;

public class Memoization_Fibonacci {
	static long[] memo;

	public static long fibonacci(int n) {
		if (n <= 1)
			return n;
		else if (memo[n] != 0)
			return memo[n];
		else
			return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static void main(String[] args) {
		memo = new long[101];
		System.out.println(fibonacci(2));
	}
}
