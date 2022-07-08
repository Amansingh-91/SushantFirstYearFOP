public class Operators {
    public static void main(String[] args) {
        // Relational operator
//        System.out.println("equality operator ==" +(12 == 13));// false
//        System.out.println("not equal operator !=" +(12 != 13));// true
//        System.out.println("greater than operator >" +(12 > 13));// false
//        System.out.println("less than operator ==" +(12 < 13));// true
//        System.out.println("greater than equal operator >=" +(12 >= 13));// false
//        System.out.println("less than equal operator <=" +(12 <= 13));// true

        // Bitwise operator
        System.out.println("bitwise and &" +((13 < 13) & (12 == 12)));// false
        System.out.println("bitwise or |" +((13 < 13) | (12 == 12)));// true
        System.out.println("bitwise X-or ^" +((13 < 13) ^ (12 == 12)));// true
        System.out.println("bitwise not ~" +(~-16));// true
        System.out.println("logical or ||" +((13 < 13) || (12 == 12)));// true
        System.out.println("logical and &&" +((13 < 13) && (12 == 12)));// flase

    }
}
