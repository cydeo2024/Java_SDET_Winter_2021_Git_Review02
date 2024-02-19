package self_Study_Tasks.day07_practice_tasks;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public void calcCost() {
        System.out.println(unitPrice * quantity);

    }

    public String toString() {
        return "day07_practice_tasks.Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}

