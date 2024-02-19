package self_Study_Tasks.day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5;
        rectangle1.lenth = 4.4;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4.4;
        rectangle2.lenth = 20;

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());

    }

    }

