public class MinCoinExchange{

    public static int minCoin(int coins[], int amount){
        int arr[][] = new int[coins.length+1][amount+1];
        for (int i = 0; i < amount+1; i++) {
            arr[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < coins.length+1; i++) {
            arr[i][0]= 0;
        }
        for (int i = 1; i <arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(coins[i-1]> j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = Math.min(arr[i-1][j], 1+ arr[i][j-coins[i-1]]);
                }
            }
        }
        return arr[coins.length][amount];
    }
    public static void main(String[] args) {
        int coins[]= {1,2,3};
        int amount = 7;
        System.out.println(minCoin(coins, amount));
    }
}