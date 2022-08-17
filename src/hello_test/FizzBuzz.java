package hello_test;

public class FizzBuzz {
	
	public static void fizzBuzz(Integer numberInput) {
		if (numberInput % 3 == 0) {
			System.out.print("Fizz");
		}
		if (numberInput % 5 == 0) {
			System.out.print("Buzz");
		}
		System.out.print("\n");
	}
	
}