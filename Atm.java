public class Atm {
    static private int balance=1000;
    public static void withdraw(int amount,User obj) throws UserDefinedException{
        if(balance >= amount){
            if(obj.Amount >= amount){
                balance -= amount;
                obj.Amount -= amount;
            }else{
                throw new UserDefinedException("account Balance Insufficient");
            }
        }
        else{
            throw new UserDefinedException("Atm Balance Insufficient");
        }
    }

    public static void main(String[] args)  {
        User obj = new User("Aman",10000);
        try{
            Atm.withdraw(500, obj);
        }catch (UserDefinedException ude){
            System.out.println(ude);
        }
        System.out.println("have a good day");
    }
}
