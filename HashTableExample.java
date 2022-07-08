import java.util.Hashtable;
import java.util.LinkedList;

public class HashTableExample {
    public static void main(String[] args) {
        String arr[] =  {"Aman","Rahul","roy","Jack"};
        LinkedList<String> hashTable[] = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            hashTable[i] = new LinkedList<>();
        }
        for (int i = 0; i < 4; i++) {
            int index =  myHash(arr[i]);
            if(hashTable[index].size() >0){
                hashTable[index].addFirst(arr[i]);
            }
            else {
                hashTable[index].add(arr[i]);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(hashTable[i]);
        }

    }
    public static int myHash(String str) {
        return str.length() % 4;
    }
}
