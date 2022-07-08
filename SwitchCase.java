import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the item");
//        int money = sc.nextInt() ;//true on
//        sc.nextLine();
        String item = sc.nextLine();
        switch(item){
            case "chips":
                System.out.println("you bought chips");
                break;
            case "coke":
                System.out.println("you bought coke");
                break;
            case "chocolate":
                System.out.println("you bought chocolates");
                break;
            default:
                System.out.println("transaction could not me completed");
        }
//        System.out.println("options chips:10rs,coke:20rs,chocolates:30rs");
//        System.out.println("enter the item");
//        String item = sc.nextLine() ;//true on
//        int coke = 10;
//        int chips = 20;
//        int chocolate = 30;
//        int item_price=0;
//        item = item.toLowerCase();
//        if(item.equals("coke")){
//            item_price = coke;
//        }
//        else if(item.equals("chips")){
//            item_price = chips;
//        }
//        else if(item.equals("chocolate")){
//            item_price = chocolate;
//        }
//        else {
//            System.out.println("item not present");
//        }
//
//        if(money < item_price){
//            System.out.println("can't but this item. money insufficient");
//        }
//        else if(money == item_price){
//            System.out.println("transaction complete. please pick your item. have a good day");
//        }
//        else{
//            int remain = money - item_price;
//            System.out.println("transaction complete. please pick your item. please pick your remaining amount : "+remain);
//
//        }
    }
}
