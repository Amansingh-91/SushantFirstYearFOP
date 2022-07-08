public class QuickSort {
    public static void sort(int arr[], int low, int high){
        if(low < high){
            int pivot = partition(arr,low, high);
            // System.out.println(pivot);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
            // System.out.println(pivot +"////////////////////");
            // for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            // }
        }
    } 
    public static int partition(int arr[], int low, int high){
        int pivotEle = arr[high];

        
        int i = low -1;
        for (int j = low; j < high; j++) {
            if(arr[j] < pivotEle){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[i+1] = arr[high] + arr[i+1];
        arr[high] = arr[i+1] - arr[high];
        arr[i+1] = arr[i+1] - arr[high];        
        return i+1;
    } 
    public static void main(String[] args) {
        int arr[] = {4,1,3,5,2};
        sort(arr, 0,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
