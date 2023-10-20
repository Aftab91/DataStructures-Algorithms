package Arrays.easy_problems;

public class fibonacciNumber {

	public static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {

		// Example usage
		int n = 2; // Replace with the desired input
		int result = fib(n);

		System.out.println("Fibonacci number at index " + n + " is: " + result);
	}
}
