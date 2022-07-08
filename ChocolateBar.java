public class ChocolateBar {
    public static void main(String[] args) {
        int arr[] = {1,4,8,9,8,3};
        int day= 17; 
        int month = 2;
        int count =0;
        for (int i = 0; i < arr.length-month+1; i++) {
            int sum = 0;
            for (int j = i; j < i+month; j++) {
                sum += arr[j];
                
            }
            // System.out.println(sum);
            if(day == sum ){
                count++;
            }
        }
        System.out.println(count);
    }
}
