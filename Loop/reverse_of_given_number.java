package Loop;

public class reverse_of_given_number {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.print(rev);
    }
}
