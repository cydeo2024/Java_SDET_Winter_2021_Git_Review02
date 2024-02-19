package self_Study_Tasks.day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scan.next();

        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf ("@"));
        String domain = email.substring(email.indexOf("@"));

        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("domain: " + domain);
    }
    public static String format(String email){
        return email.substring(0).toUpperCase()+ email.substring(6);
    }





}
/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */