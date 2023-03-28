public class HierarchialInteritance {
    public static void main(String[] args) {
    Bird eagle = new Bird();
    eagle.eat();
    }
}
class Animal2{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){

        System.out.println("breathes");
    }
}
class Mammal extends Animal2{
    void walk(){
        System.out.println("walks");
    }
}
class Fish1 extends Animal2{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal2{
    void fly(){
        System.out.println("fly");
    }
}
