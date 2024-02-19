package self_Study_Tasks.day10_practice_task;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = " Wooden Spoon123! ";

        String letters = "";
        String  digits = "";
        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letters += each;
            }else if (Character.isDigit(each)){
                digits += each;
            }else{
                specialChar += each;
            }
            
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Char = " + specialChar);

    }
}

/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */