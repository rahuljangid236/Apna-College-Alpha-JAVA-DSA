public class SuperKeyword {
    public static void main(String[] args) {
    Horses h = new Horses();
    }
}
class Animals{
    Animals(){
        System.out.println("animals cons called");
    }
}
class Horses extends Animals{
    Horses(){
        super();
        System.out.println("Horses cons called");
    }
}
