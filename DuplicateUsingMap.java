import java.util.HashMap;
import java.util.Map;

class DuplicateUsingMap{




    public static void main(String[] args) {
        // int arr[] = {1,2,2,1,3,3,3,1,2,3};
        // HashMap<Integer,Integer> map =  new HashMap<>();
        // for(int i = 0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i], 1);
        //     }
        // }
        // for (Map.Entry<Integer,Integer> i : map.entrySet()) {
        //     System.out.println("element"+i.getKey()+" count:"+i.getValue());
        // }
        int arr[][] = {{1,2},{2,3},{3,4},{2,1},{4,3}};
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            if(map.containsKey(b) && map.get(b)==a){
                System.out.println("symmetric pair ("+a+" , "+b+")");
            }
            else{
                map.put(a, b);
            }
        }
        // for (Map.Entry<Integer,Integer> i : map.entrySet()) {
        //     System.out.println("element"+i.getKey()+" count:"+i.getValue());
        // }
    }
}