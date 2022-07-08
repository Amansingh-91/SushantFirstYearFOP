import java.util.HashSet;

public class PairSum {
    public static boolean check(int arr[], int sum){
        HashSet<Integer> myset =  new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(myset.contains(sum - arr[i])){
                System.out.println("Pair" + arr[i] +" : "+ (sum - arr[i]) );
                return true;
            }
            else{
                myset.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,40,8,-7};
        System.out.println(check(arr, 15));
    }
}
