class LinearSearch{
    public static boolean search(int ar[], int key){
        
        
        for(int i =0; i<ar.length;i++){
            if(ar[i] == key){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int ar[] = {2,1,4,3,6,5};
        System.out.println(search(ar, 7));
        System.out.println(search(ar, 5));
    }
}