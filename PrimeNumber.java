import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.nextLine();
        boolean notPrime = false;
        for(int i =2 ; i <= num/2;i++){
            if( num%i ==0){
                notPrime = true;
                System.out.println("not a prime number");
                break;
            }
        }
        if(notPrime == false){
            System.out.println(num+" is Prime number");
        }

    }

}
