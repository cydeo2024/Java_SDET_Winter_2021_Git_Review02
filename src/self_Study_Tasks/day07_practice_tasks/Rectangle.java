package self_Study_Tasks.day07_practice_tasks;

public class Rectangle {
    public double width, lenth;

    public double calculateArea() {
        return width * lenth;
    }

    public double calculatePerimeter(){
        return 2 * (width + lenth);
    }

    @Override
    public String toString() {
        return "day07_practice_tasks.Rectangle{" +
                "width=" + width +
                ", lenth=" + lenth +
                '}';
    }


}



/*
Create a custom class named day07_practice_tasks.Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named day07_practice_tasks.RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.

 */