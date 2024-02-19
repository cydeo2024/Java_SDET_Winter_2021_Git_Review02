package self_Study_Tasks.day09_practice_task;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classMates = {"Anna Bon", "Mark Smith", "Jorg Poul", " Sam Boy", "Mark Tonny",
                "Carl Mark", "Mat Bruce", "Suzan Nil", " Adam Cot", "Merry Role"};
        for(int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName = " ";
            for (int j = name.length()- 1; j >= 0 ; j--){
               reverseName += name.charAt(j);

            }

            System.out.println(reverseName);

        }

    }
}

/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */