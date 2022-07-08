public class DogDemo {
    String name;
    String gender;
    int age;
    // creating a function
    public String bark(){
        System.out.println(this.name+"barking");
        return this.name;
    }
    public static void main(String[] args) {
        DogDemo tom = new DogDemo();
        tom.name = "tom" ;
        System.out.println(tom.name);
        DogDemo tommy = new DogDemo();
        tommy.name = "tommy";
        tommy.gender = "male";
        System.out.println(tommy.name+" "+tom.name);
//        return "Aman";
        System.out.println(tom.bark());
        String name= tommy.bark();
        System.out.println(name   );
    }
}
