public class BinarySearch {
    public static int search(int arr[],int key){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key == arr[mid]){
                return arr[mid];// count
            }
            else if(key < arr[mid]){
                end = mid -1;
                //count++;
            }
            else{
                start = mid +1;
                // count++
            }
        }
        return -1;
    }
    public static int searchCount(int arr[],int key){
        int start = 0;
        int end = arr.length -1 ;
        int count=0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key == arr[mid]){
                return count;// count
            }
            else if(key < arr[mid]){
                end = mid -1;
                count++;
            }
            else{
                start = mid +1;
                count++;
            }
        }
        return count;
    } 
    public static int searchRec(int arr[],int key,int start,int end){
        if(start <= end){
           
            int mid = start + (end - start)/2;
            
            if(arr[mid] == key){
                return key;
            }
            else if(arr[mid ]> key){
                return searchRec(arr, key, start, mid-1);
            }
            else{
                return searchRec(arr, key,mid +1 , end);
            }
        }
        return -1;
    }
    public static int searchCount(int arr[]){
        int actual =0;
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length -1 ;
            int key = arr[i];
            int count=0;
            
            while(start <= end){
                // System.out.println("start:" + start +" end:"+ end);
                int mid = start + (end - start)/2;
                System.out.println("mid ele:"+arr[mid]);
                if(key == arr[mid]){
                    count++;
                    break;// count
                }
                else if(key < arr[mid]){
                    end = mid -1;
                    
                }
                else{
                    start = mid +1;
                    
                }
                count++;
            }
            System.out.println(count);
            actual += (count);
            
        }    
        return actual;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        //,13,14,15,16,17,18,19,20
        
        System.out.println(searchCount(arr)/12);
        // System.out.println(searchRec(arr, 10, 0, 9));
    }
}
