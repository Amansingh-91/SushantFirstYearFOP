public class Customer {
    String Name;
    int amount;
    int account;
    static int CustomerCount;
    Customer(String name, int amount,int account){
        this.Name = name;
        this.amount = amount;
        this.account = account;
        CustomerCount++;

    }
}
