package self_Study_Tasks.day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {


        //Luke, your order for 5 Apples has been placed. Your total is 7.5.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = input.next();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter the first name");
        String firstName = input.next();

        double total = price * quantity;
        System.out.println( firstName + "," + " your order for " + quantity + " " + productName + " has been placed. Your total is " + total + "."  );
        input.close();



    }
}
/*
Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */