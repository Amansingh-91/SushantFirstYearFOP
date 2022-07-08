public class SwapTwoNumber {
    int a ;
    int b;
    public void swap(SwapTwoNumber s1){
        System.out.printf("before swap a:%d and  b:%d \n",s1.a,s1.b);
        int c ;
        c = s1.a;
        s1.a= s1.b;
        s1.b = c;
        System.out.printf("after swap a:%d and  b:%d \n",s1.a,s1.b);
    }
    public void setValue(int a, int b){
        this.a = a;
        this.b =b;
    }
    public static void main(String[] args) {
        SwapTwoNumber s1 = new SwapTwoNumber();
        System.out.println("swap these two numbers");
        s1.setValue(10,20);
        System.out.printf("before swap a:%d and  b:%d  outside \n",s1.a,s1.b);

        s1.swap(s1);
        System.out.printf("after swap a:%d and  b:%d outside \n ",s1.a,s1.b);

//        String name ="aman Saini";
//        System.out.printf("my name is %s \n",name);
//        System.out.print("in ");
//        System.out.print("same ");
//        System.out.print("line");
//        System.out.println("swap these two numbers without third variable");
//        int x = 30;
//        int y =40;
//        System.out.printf("before swap a:%d and  b:%d \n",x,y);
//        x = x +y;
//        y = x - y;
//        x = x-y;
//        System.out.printf("before swap a:%d and  b:%d \n",x,y);



    }
}
