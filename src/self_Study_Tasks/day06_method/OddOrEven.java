package self_Study_Tasks.day06_method;

public class OddOrEven {
    public static void main(String[] args) {
        isEven(100);
        System.out.println("isOdd(100) = " + isOdd(100));

    }

    public static boolean isOdd(int number) {

        if (number % 2 != 0){
            return true;
        } else {
            return false;

        }


    }
        public static boolean isEven ( int number){
            return !isOdd(number);
    }
}
/*
Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */