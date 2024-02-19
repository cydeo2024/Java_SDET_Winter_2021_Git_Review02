package self_Study_Tasks.day09_practice_task;

public class ClassmateInitials {
    public static void main(String[] args) {
        String[] classmates = {"John Smith", "Mikle Jackson", "Robert Scotch", "Tom Jerry",
                "Masha Dad", "Nanny Bread", "Adam Pop", "Alice Bad", "Sam Ted", "Jorg Club"};


        for (int i = 0; i < classmates.length; i++) {
            String initials = classmates[i].charAt(0) + "." + classmates[i].charAt( classmates[i].indexOf(" ") + 1);
            System.out.println(initials);

        }
    }


    }


/*
 Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */