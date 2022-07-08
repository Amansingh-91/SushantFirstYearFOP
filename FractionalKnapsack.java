import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class FractionalKnapsack {
    class Item{
        int id;
        int weight;
        double profit;
        double effectiveProfit;
        public Item(int id, int weight, double profit) {
            this.id = id;
            this.weight = weight;
            this.profit = profit;
            this.effectiveProfit = profit/weight;
        }
        
    }
    public static double maxProfit(ArrayList<Item> items, int capacity){
        double max =0.0;
        int remaingCapacity = capacity;
        Collections.sort(items,new Comparator<Item>() {

            @Override
            public int compare(FractionalKnapsack.Item o1, FractionalKnapsack.Item o2) {
                // TODO Auto-generated method stub
                if(o1.effectiveProfit < o2.effectiveProfit){
                    return 1;
                }
                else if(o1.effectiveProfit > o2.effectiveProfit){
                    return-1;
                }
                return 0;
            }
            
        });
        for (Item item : items) {
            if(remaingCapacity >= item.weight){
                max += item.profit;
                remaingCapacity -= item.weight;
            }
            else{
               max += (remaingCapacity * item.effectiveProfit);
               remaingCapacity =0;

            }
            if(remaingCapacity ==0){
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        FractionalKnapsack j = new FractionalKnapsack();
        for (int i = 0; i <4; i++) {
            System.out.println("enter the weight of item"+(i+1));
            int weight =  sc.nextInt();
            
            System.out.println("enter the profit of item"+(i+1));
            double profit =  sc.nextDouble();
            items.add(j.new Item(i+1, weight, profit));
        }
        System.out.println(maxProfit(items, 15));
        sc.close();
    }


    
}
