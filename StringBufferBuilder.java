public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer  str1 = new StringBuffer("Aman");
        StringBuffer str2 = str1;
        str2.append(" Saini");
        System.out.println(str1);
        StringBuilder  str3 = new StringBuilder("Aman");
        StringBuilder str4 = str3;
        str3.append(" Saini");
        str3.delete(0,4);
        System.out.println(str3);
    }
}
