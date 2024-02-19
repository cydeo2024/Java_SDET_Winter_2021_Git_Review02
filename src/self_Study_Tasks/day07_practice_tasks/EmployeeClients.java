package self_Study_Tasks.day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Saida";
        employee1.age = 25;
        employee1.gender = 'F';
        employee1.jobTitle = "QA";
        employee1.salary =25.000;


        Employee employee2 = new Employee();
        employee2.name = "John";
        employee2.age = 30;
        employee2.gender = 'M';
        employee2.jobTitle = "Software developer";
        employee2.salary =30.000;

        Employee employee3 = new Employee();
        employee3.name = "Betty";
        employee3.age = 40;
        employee3.gender = 'F';
        employee3.jobTitle = "Doctor";
        employee3.salary = 50.000;

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

        employee2.work();

        employee3.work();

    }
}
