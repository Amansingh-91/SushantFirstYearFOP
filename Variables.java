public class Variables {
    int y;
    static int z;
    public static void main(String[] args){// variable Declaration
        int marks ;
        // variable initialization
        marks = 12;
        // variable Declaration and initialization
        int amanMarks = 20; 
        // Print out on console
        System.out.println(marks);
        System.out.println(amanMarks);

        // variable updation 
        amanMarks = 10; // changed the value of variabe
        int sum = amanMarks + 20;
        amanMarks = sum;


        if(amanMarks >100){

            int x= 20;
            System.out.println(x);
        }
        Variables v= new Variables();
        v.Greet("afternoon","Aman");
        Variables.Greet("afternoon","Dharam");
        System.out.println(v.y);
        System.out.println(Variables.z);
        System.out.println(v.z);
        // Print out on console
        System.out.println(marks);
        System.out.println(amanMarks);
        // Print out on console in Same Line
        System.out.print(marks);
        System.out.print(amanMarks);
    }

    public void Greet(){
        System.out.println("Hello friends");
    }
    public static void Greet(String time, String name){
        System.out.println("Good "+time +" "+name);
        System.out.printf("good %s %s\n",time,name);
    }

}

class B extends Variables{

    public void Greet() {
        System.out.println("in child class");
    }
}