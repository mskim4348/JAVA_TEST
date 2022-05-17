package algorithm;

public class Memoization {
	public static void main(String args[]) {

		System.out.println(factorial(2));
		System.out.println(factorial(3));
	}

	static int factorial(int number) {
		if (number > 0) {
			return number * factorial(number - 1);
		} else {
			return 1;
		}
	}
}
