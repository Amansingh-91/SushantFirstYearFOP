import java.util.HashSet;

class TimeComplexity{
    public static void main(String[] args) {
        int id[]= {1,3,5,3,4,2,1000000};
        int k =1000000;
        int count[] = new int[k+1];
        for(int i =0; i< id.length;i++){
            count[id[i]]++;
            if(count[id[i]]==2){
                System.out.println(id[i]+" ");
            }
            System.out.println();
        }
        // second method
        HashSet<Integer> myset = new HashSet<>();
        for (int i = 0; i < id.length; i++) {
            if(myset.contains(id[i])){
                System.out.println(id[i]+" ");
            }
            else{
               myset.add(id[i]); 
            }
            System.out.println();
        }

    }
}