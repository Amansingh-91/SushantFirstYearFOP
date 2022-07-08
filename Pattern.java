public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int j =0; j< n ;j++){
            for (int i = 0; i< n-j-1;i++){
                System.out.print("  ");
            }
            for (int k =0; k <=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
