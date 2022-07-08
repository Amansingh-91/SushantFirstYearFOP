public class Outter {
    String s ;
    static class inner{
        String s2 ;
        void show(){
            System.out.println(s2);
        }
    }

    public static void main(String[] args) {
        Outter o = new Outter();
        Outter.inner obj = new inner();
        obj.show();
    }
}
