public class Car {
    String Name;
    String Brand;
    int price;
    Car(){
        this.Name =  "Harrier";
        this.Brand = "Tata";
        this.price = 2100000;
    }
    Car(String Name, String Brand, int price){
        this.Name =  Name;
        this.Brand = Brand;
        this.price = price;
    }
    public  void Display(){
        System.out.printf("Car Name %s \nbrand Name %s \nprice %d\n",this.Name,this.Brand,this.price);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Display();
        Car c2 =  new Car("Nexon","Tata",2100000);
        c2.Display();
    }

}
