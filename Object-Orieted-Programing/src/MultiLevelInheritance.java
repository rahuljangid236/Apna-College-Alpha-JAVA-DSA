public class MultiLevelInheritance {
    public static void main(String[] args) {
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
    }
}
class Animal1{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammels extends Animal1{
    int legs;
}
class Dog extends  Mammels{
    String bread;
}