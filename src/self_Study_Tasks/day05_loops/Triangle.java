package self_Study_Tasks.day05_loops;

public class Triangle {
    public static void main(String[] args) {
        int raw = 10;

        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }

    }
}
/*
Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *

 */