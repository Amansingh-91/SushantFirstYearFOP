public class EditDistance {
    public static int minDistance(String s1, String s2){
        int n =  s1.length();
        int m =  s2.length();
        int arr[][] = new int[n+1][m+1];
        for(int i = 0; i < arr.length;i++){
            arr[i][0] = i;
        }
        for(int i = 0; i < arr[0].length;i++){
            arr[0][i] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
               if(s1.charAt(i-1) == s2.charAt(j-1)){
                arr[i][j]  = arr[i-1][j-1];
               }
               else{
                    arr[i][j] = minOfThree(arr[i][j-1],arr[i-1][j-1] ,arr[i-1][j])+1;
               } 
            }
        }
        return arr[n][m];
    }
    public static int minOfThree(int a, int b, int c){
        return c <(a<b?a:b)? c:((a<b)?a:b);
    }
    public static void main(String[] args) {
        String s1 = "exponential";
        String s2 = "potential";
        System.out.println(minDistance(s1, s2));
    }
}
