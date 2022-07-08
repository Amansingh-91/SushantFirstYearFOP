import java.sql.SQLOutput;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         int input
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("the number you entered is " + x + "");
        // short input
        System.out.println("Enter the short");
        System.out.println("Enter the short");
        short s1 = sc.nextShort();
        System.out.println("the number you entered is " + s1+ "");
        // byte input
        System.out.println("Enter the byte");
        byte b1 = sc.nextByte();
        System.out.println("the number you entered is " + b1+ "");
        // float input
        System.out.println("Enter the float");
        float f1 = sc.nextFloat();
        System.out.println("the number you entered is " + f1+ "");
        // boolean input
        System.out.println("Enter the boolean");
        boolean b2 = sc.nextBoolean();
        System.out.println("the number you entered is " + b2+ "");
        // String next input
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("the number you string is " + str+ "");
//        sc.nextLine();
//         String nextLine input
        sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println("the number you string is " + str1+ "");
    }
}
