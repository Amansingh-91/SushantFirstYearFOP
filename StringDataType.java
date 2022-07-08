import java.util.Scanner;
public class StringDataType {
    public static void main(String[] args){
        String str ;
        str = "Aman Saini";
        String str1 = "I am your teacher";
        Scanner scanner;
        scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name ");
        String firstName = sc.next();
        sc.nextLine();
        System.out.println("Enter the Last name ");
        String LastName = sc.next();
        System.out.println("welcome "+ firstName + " "+ LastName) ;

    }
}
