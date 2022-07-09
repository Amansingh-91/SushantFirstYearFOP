public class TotalNoOfWaysCoinExchange {
    public static int totalNoOfWays(int coins[], int amount){
        int arr[][] = new int[coins.length+1][amount+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] =1;
        }
        for (int i = 1; i < arr[0].length; i++) {
            arr[0][i] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
               if(coins[i-1] > j){
                arr[i][j] = arr[i-1][j];
               } 
               else{
                arr[i][j] = arr[i-1][j] + arr[i][j-coins[i-1]];
               }
            }
        }

        return arr[coins.length][amount];
    }
    public static void main(String[] args) {
        int coins[]= {1,2,3};
        int amount =7;
        System.out.println(totalNoOfWays(coins, amount));
    }
}
