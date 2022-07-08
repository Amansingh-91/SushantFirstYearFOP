
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveElement {
    public static boolean check(int arr[]){
        
        Set<Integer> myset = new HashSet<>();
        for(int i = 0; i< arr.length;i++){
            myset.add(arr[i]);
        }
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer integer : myset) {
            if(integer > max){
                max = integer;
            }
            if(integer < min){
                min = integer;
            }
        }
        System.out.println(max +" "+ min);
        if(max-min+1 == myset.size())
            return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,7,6,8,2};
        System.out.println(check(arr));
    }
}
