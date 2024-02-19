package self_Study_Tasks.day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "book";
        item1.unitPrice = 5.99;
        item1.quantity = 3;

        Item item2 = new Item();
        item2.itemName = "toy";
        item2.unitPrice = 9.99;
        item2.quantity = 5;

        System.out.println(item1);
        System.out.println(item2);

        item1.calcCost();
        item2.calcCost();






    }
}
