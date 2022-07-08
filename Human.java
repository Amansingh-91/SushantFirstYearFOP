public class Human {
    String Name;
    int age;
    Human(){
        System.out.println("in default of human");
    }
    Human(String name ,int age){
        System.out.println("in parameterized of human");
        Name= name;
        this. age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eating");
    }
}
class Man extends Human{
    Man(){
//            super();
//        super("aman",25);
        System.out.println("in derived default cunstructor ");
    }
    Man(String name, int age){
        System.out.println("in parameterized of man");
    }
    public void walk(){
        System.out.println("walking");
    }

    public static void main(String[] args) {
        Man obj1 = new Man("aman",25);
        obj1.eat();
    }
}
