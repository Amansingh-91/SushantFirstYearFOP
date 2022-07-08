public class HumanDemo {
    String name;
    static int count;

    public static void main(String[] args) {
        HumanDemo h1 =  new HumanDemo();
        HumanDemo h2 =  new HumanDemo();
        HumanDemo h3 =  new HumanDemo();
        h1.name = "aman";
        h1.count++;
        System.out.println(h1);
        System.out.println(h1.name + " "+h1.count);
        h2.name = "joy";
        h2.count++;
        System.out.println(h2.name + " "+h2.count);
        h3.name = "jack";


        System.out.println(h3.name + " "+h3.count);

    }
    public String toString(){
        return this.name;
    }
}
