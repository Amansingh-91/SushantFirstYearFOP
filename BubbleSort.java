public class BubbleSort {
    public static void sort(int arr[]){
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] -arr[j+1];
                    arr[j] = arr[j ] -arr[j+1];
                }
            }
            
        }
    }
    public static void sortOpt(int arr[]){
        boolean sorted ;
        int count =0;
        for (int i = arr.length-1; i > 0; i--) {
            sorted = true;
            System.out.println("pass "+count);
            for (int j = 0; j < i; j++) {
                
                if(arr[j] > arr[j+1]){
                    System.out.println("performing swap ");
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] -arr[j+1];
                    arr[j] = arr[j ] -arr[j+1];
                    sorted = false;
                }
            }
            count++;
            if(sorted){
                System.out.println("stopping");
                break;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,6,8,9,3};
        int arr1[]={1,2,3,4,5,6};
        sortOpt(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
