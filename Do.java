import java.util.Arrays;
import java.util.Scanner;

public class Do{
    // function to print the required pattern
    public static String func(int n) {
        //write your code here
        String str = "";
        if(n > 0){
            str = func(n - 1);
            str += "\n";
            for(int i = 0; i < n; i++){
                str += "* ";
            }
            return str;
       }
       return str;
    }
 //   String func(int n, int j){
        
 //   }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str =func(n);
        System.out.println(str);
        
    }

}

