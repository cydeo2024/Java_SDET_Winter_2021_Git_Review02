package self_Study_Tasks.day09_practice_task;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50,39.99};
        int[] itemIDs = {12345, 12346,  12347, 12348, 12349, 12350};

        int IndexNumOfGloves = -1;
        boolean hasIPad = false;
        String report = " ";

        for (int i = 0; i <items.length ; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            if(itemName.equals("Gloves")){
                IndexNumOfGloves = i;
            }
            if(itemName.equals("iPad")){
                hasIPad = true;
            }
            report += itemName + " - " + itemPrice + " - #" + itemID + "\n";
        }
        String indexNumOfGloves;
        System.out.println("indexNumOfGloves = " + IndexNumOfGloves);
        System.out.println("hasIPad =" + hasIPad);
        System.out.println(report);
    }
}
/*
Create a class named Items and write a program with the following specifications:
        5.1 Given arrays with the same length:
String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
        5.3 Check if "iPad" is contained in the item list.
        5.4 Print the report for each shopping item in the format:
name - price - #ID

 */