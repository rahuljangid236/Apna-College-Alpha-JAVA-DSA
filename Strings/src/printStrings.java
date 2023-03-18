public class printStrings {
    public static void printLetters(String fullName){
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
    public static void main(String[] args) {
        String firstName = "Rahul";
        String lastName = "Jangid";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);
        printLetters(fullName);

    }
}
