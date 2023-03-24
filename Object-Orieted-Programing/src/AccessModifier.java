public class AccessModifier {
    public static void main(String[] args) {
    BankAccount myAcc = new BankAccount();
    myAcc.userName = "rahuljangid236";
    myAcc.setPassword("abcd");
    }
}
class BankAccount{
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
