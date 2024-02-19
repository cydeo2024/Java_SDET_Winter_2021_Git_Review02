package self_Study_Tasks.day08_practice_tasks;

public class SrartsWithX {
    public static void main(String[] args) {
        String str = "xcodex";
        if (str.charAt(0) == 'x') {
            str = str.replaceFirst("x", "a");
            System.out.println(str);


        }

    }
}
/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */