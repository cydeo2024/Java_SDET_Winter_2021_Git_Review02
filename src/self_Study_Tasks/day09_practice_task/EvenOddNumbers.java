package self_Study_Tasks.day09_practice_task;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7}; //declare an int variable array and assigned a value

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){ //if array i evenly divissible by 2 = 0
                oddCount++; //counts odd number
        }else{
                evenCount++; //counts even number
            }

        }
        System.out.println("The array has " + oddCount + " odd numbers " + " and " + evenCount + " even numbers. ");

    }
}

/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.


 */