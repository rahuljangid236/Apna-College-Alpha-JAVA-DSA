public class Constructors {
    public static void main(String []args){
    Student1 s1 = new Student1("Rahul");
    System.out.println(s1.name);
    }
}
class Student1{
    String name;
    int roll;
    Student1(String name){
        this.name = name;
        System.out.println("Constructor is Called");
    }
}
