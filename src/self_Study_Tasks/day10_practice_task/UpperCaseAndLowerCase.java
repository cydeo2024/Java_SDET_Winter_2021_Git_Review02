package self_Study_Tasks.day10_practice_task;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        int countUpperCase = 0,
                countLowerCase = 0;


        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    countUpperCase++;

                }else{
                    countLowerCase++;
                }
            }
        }
        System.out.println(countUpperCase == countLowerCase);
    }
}

/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true

 */