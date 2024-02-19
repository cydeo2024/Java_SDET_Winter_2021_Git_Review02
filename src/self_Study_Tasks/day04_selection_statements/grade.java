package self_Study_Tasks.day04_selection_statements;

public class grade {
    public static void main(String[] args) {

        char grade = 'B';
        String result;

        switch (grade) {

            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);


    }
}




/*Create a class called Grade. A char variable named grade is given.
Write a program to print the following messages:

        'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
Otherwise: Invalid Grade

Example:
grade = 'B'

Output:
Great job

 */
