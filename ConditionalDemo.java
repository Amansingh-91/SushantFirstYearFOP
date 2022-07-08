import java.util.Scanner;
public class ConditionalDemo {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the button value");
        int button = sc.nextInt() ;//true on
        sc.nextLine();
        if(button < 0){
            System.out.println("<0");
            if(button == -1) {
                System.out.println("-1");
            }
            else {
                System.out.println("negative");
            }

        }
        else if(button == 0){
            System.out.println("lights off");
        }
        else if(button == 2){
            System.out.println("2");
        }
        else{
            System.out.println("lights on");
        }
    }
}
