package self_Study_Tasks.day06_method;

public class EmployeeInfo {
    public static void main(String[] args) {

        displayEmployeeInfo("Josh", 29, "New York");

        System.out.println("----------------------------");
        String name = "Izabella";
        int age = 35;
        String city = "Los Angeles";
        displayEmployeeInfo(name, age, city);


    }

public static void displayEmployeeInfo(String name, int age, String city){

    System.out.println("day07_practice_tasks.Employee name is " + name);
    System.out.println(name + " is " + age + " years old");
    System.out.println(name + " is " + " from " + city);
}

}
