import javax.print.attribute.HashAttributeSet;

public class HashingExample {

    static String HashTable1[] = new String[5];
    public static void insertData(String data){
        int index = myHashFunction(data);
        HashTable1[index]= data;
    }
    public static int myHashFunction(String data){
        return data.length()%5;
    }
    public static String find(String data){
        int index = myHashFunction(data);
        if(data.equals(HashTable1[index])){
            return data +" found";
        }
        return data + " not found";
    }

    public static void main(String[] args) {
        insertData("aman");
        insertData("divya");
        insertData("dharam");
        System.out.println(find("aman"));
        System.out.println(find("jack"));
    }
}
