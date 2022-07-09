public class FibDp {
    public static int recFib(int n){
        if(n <=1){
            return 1;
        }
        return recFib(n-1 )+ recFib(n-2);
    }// 2^n
    public static int fibWArr(int n){
        int arr[] = new int[n+1];
        arr[0] =1;
        arr[1] =1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }// 
    public static int fibWOArr(int n){
       
        int first =1;
        int second =1;
        for (int i = 2; i <=n; i++) {
            int temp = first + second;
            second = first;
            first = temp;
        }
        return first;
    }
    public static void main(String[] args) {
        System.out.println(recFib(5)+" rec");
        System.out.println(fibWArr(5)+" array");
        System.out.println(fibWOArr(5)+" without");
    }
}
