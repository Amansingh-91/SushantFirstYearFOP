
public class AirthematicOperations {
    public static void main(String[] args) {
        int x = 5;
        long y = 2L;
        float z = 5.0f;
        double a;
        // Addition
        a = x + y;// 30.0
        System.out.println(a);
        // Subtraction
        a = x - y;// 10.0
        System.out.println(a);
        // division
        a = z / y; // 2.0
        System.out.println(a);
        // multiplication
        a = x * y;// 200.0
        System.out.println(a);
        // mod
        a = x % y;// 0.0
        System.out.println(a);
        // increment
        a = ++x;// 21.0
        System.out.println(a);
        // decrement
        a = y--; // 10.0
        System.out.println(a);
        System.out.println(y);

    }
}
