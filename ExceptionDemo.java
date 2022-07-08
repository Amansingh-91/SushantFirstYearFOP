import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        try{
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("x ="+x);
            String a = null;
            System.out.println(a.length());
        }catch(ArithmeticException e){
            System.out.println("in catch");
        }
        catch(InputMismatchException e){
            System.out.println("in input mismatch"+e);
        }
            finally {
            System.out.println("i am here");
            sc.close();
        }


    }
}
