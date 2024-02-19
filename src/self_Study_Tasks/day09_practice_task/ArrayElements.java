package self_Study_Tasks.day09_practice_task;

public class ArrayElements {
    public static void main(String[] args) {
      int[] array = new int[100]; //array with a length of 100
        for (int i = 0; i < array.length; i++) {//assigned value to the indexes of array from 1-100
            array[i] = i +1;

        }
        //Displaying the array elements in a single line separated by spaces.
        System.out.println("----------------------------------");
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

            System.out.println("----------------------------------");
            System.out.println("Array elements in reversed order: ");
            for (int i = array.length-1; i >= 0 ; i--) {
                System.out.println(array[i] + " ");
            }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Elements evenly divisible by 5: ");
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 5 == 0){
                System.out.println(array[i] + " ");

            }

        }
        System.out.println();
            }

        }


/*
Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.


 */