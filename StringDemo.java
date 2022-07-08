public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Aman";
        String s2 = "Aman";
        s1 = "divya";
        System.out.println(s1 +" "+ s2);
        String s3 =  new String("Aman");
        if (s1 == s2){
            System.out.println("s1 = s2");
        }
        if (s3 == s2){
            System.out.println("s3 = s2");
        }
        String s4 =  new String("Saini");
        s3 =s3.concat(s4);
        System.out.println(s3);// print
    }
}
