package self_Study_Tasks.day04_selection_statements;

public class ageGroups {
    public static void main(String[] args) {

        int age = 42;
        String result = "";
        boolean valid = age >= 0 || age <= 50;


        if (valid) {

            if (age >= 55) {
                result = "Senior";
            } else if (age >= 21) {
                result = "Adult";
            } else {
                result = "Teenager";
            }
        } else {
            result = "Inalid";
        }
        System.out.println("Young Middle - Aged " + result);
    }
}







/*Create a class named AgeGroups. An integer variable named age is given.
Write a program that can determine the age group of a person. The age groups are:

Teenager (0 ~ 20)
Adult   (21 ~ 55)
Senior  (55 or older)

If the age is negative or greater than 150, print "Invalid."


Example:
age = 42

Output:
Young Middle-Aged Adult

 */

