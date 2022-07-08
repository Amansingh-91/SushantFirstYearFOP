import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Palandrom {
    public static void main(String[] args) {
        Stack<Character> reverse = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String data =  sc.nextLine();
        char ch[] = data.toCharArray();
        for(int i =0; i< ch.length;i++){
            reverse.push(ch[i]);
        }
        Iterator<Character> it= reverse.iterator();
        String temp = "";
        for(int i =0; i< ch.length;i++){
            temp += reverse.pop();
        }
        if(data.equals(temp)){
            System.out.println("palandrom");

        }
        else{
            System.out.println("not palandrom");
        }

//        System.out.println(temp);
    }
}
