import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class KnapSack01 {
    static class Item{
        int id;
        int weight;
        int profit;
        public Item(int id, int weight, int profit) {
            this.id = id;
            this.weight = weight;
            this.profit = profit;
        }
        
    }
    public static int maxProfit(ArrayList<Item> items,int capacity){
        Collections.sort(items,new Comparator<Item>() {

            @Override
            public int compare(KnapSack01.Item o1, KnapSack01.Item o2) {
                // TODO Auto-generated method stub
                return o1.weight - o2.weight;
            }
            
        });
        int n =items.size();
        int arr[][] = new int[n+1][capacity+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=0;
        }
        for (int i = 1; i < arr[0].length; i++) {
            arr[0][i] =0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                int w = items.get(i-1).weight;
                if(w > j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j],items.get(i-1).profit+ arr[i-1][j-w]);
                }
            }
        }

        
        return arr[n][capacity];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item>items = new ArrayList<>();
        System.out.println("enter the items");
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the weight of item"+(i+1));
            int weight =  sc.nextInt();
            sc.nextLine();
            System.out.println("enter the profit of item"+(i+1));
            int profit =  sc.nextInt();
            sc.nextLine();

            items.add(new Item(i+1, weight, profit));
        }
        System.out.println(maxProfit(items, 6));
    }
}
