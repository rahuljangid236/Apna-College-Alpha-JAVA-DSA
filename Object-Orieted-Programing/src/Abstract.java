public class Abstract {
    public static void main(String[] args) {
    Horse h =new Horse();
    h.eat();
    h.walk();
    Chicken c = new Chicken();
    c.eat();
    c.walk();
    }
}
abstract class Animal3{
    String color;
    Animal3(){
    color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal3{
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal3{
    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}