package self_Study_Tasks.day07_practice_tasks;


import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles");

        double miles = input.nextDouble();
        double kilometers = miles * 1.609344;
        System.out.println( miles + " miles " + " is equal to " + kilometers + " kilometers ");
        input.close();

    }

}

/*
 Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers
 */