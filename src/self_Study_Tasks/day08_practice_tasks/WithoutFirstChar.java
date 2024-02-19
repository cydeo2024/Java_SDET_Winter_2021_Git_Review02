package self_Study_Tasks.day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstword = input.next();
        System.out.println("Enter your second word");
        String secondword = input.next();
        input.close();
        String result = firstword.substring(1)+secondword.substring(1);
        System.out.println(result);






    }
}
/*
Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */