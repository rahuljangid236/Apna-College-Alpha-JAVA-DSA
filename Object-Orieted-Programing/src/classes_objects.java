public class classes_objects {
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float per;
    void calcPer(int phy,int chem, int math){
        per = (phy+chem+math)/3;
    }
}