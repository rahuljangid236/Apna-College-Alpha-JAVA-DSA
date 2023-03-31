public class StaticKeyword {
    public static void main(String[] args) {
    Students s1 = new Students();
    s1.schoolName = "JMV";
    Students s2 = new Students();
        System.out.println(s2.schoolName);
    }
}
class Students{
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}