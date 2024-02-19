package self_Study_Tasks.day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Johes Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        Address address2 = new Address();
        address2.buildingNumber = 1369;
        address2.street = "Bay Ridge Avenue";
        address2.city = "Brooklyn";
        address2.state = "NY";
        address2.zipCode = 11219;

        Address address3 = new Address();
        address3.buildingNumber = 6224;
        address3.street = " Fort Hamilton Parkway";
        address3.city = "Brooklyn";
        address3.state = "NY";
        address3.zipCode = 11220;

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);



    }
}
/*buildingNumber = 7925;
street = "Jones Branch Dr";
city = "McLean";
state = "VA";
zipCode = 22012;

 */