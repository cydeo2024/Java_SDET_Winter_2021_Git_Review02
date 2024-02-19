package self_Study_Tasks.day09_practice_task;

public class StudentGrade {
    public static void main(String[] args) {
        String[] studentNames ={"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[studentNames.length];

        for (int i = 0; i <grades.length ; i++) {
            int score = scores[i];



                if(score >= 90){
                    grades[i] = 'A';
            }else if(score >= 80){
                grades[i] ='B';

            }else if(score >= 70) {
                grades[i] = 'C';
            }else if(score >= 60){
                    grades[i] = 'D';

            }else {
                    grades[i] = 'F';
                }

            System.out.println(studentNames[i] + "'s score is " + score+ ", and grade is" + grades);



            }


    }
}

/*
. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B

 */