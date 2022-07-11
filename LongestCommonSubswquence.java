public class LongestCommonSubswquence {
    public static int lcs(String s1, String s2){
        int n =  s1.length();
        int m =  s2.length();
        int arr[][] = new int[n+1][m+1];
        for(int i = 0; i < arr.length;i++){
            arr[i][0] = 0;
        }
        for(int i = 0; i < arr[0].length;i++){
            arr[0][i] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
               if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
               }
               else{
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
               } 
            }
        }
        return arr[n][m];
    }
    public static void main(String[] args) {
        String s1 = "at";
        String s2 = "dog";
        System.out.println(lcs(s1, s2));
    }
}
