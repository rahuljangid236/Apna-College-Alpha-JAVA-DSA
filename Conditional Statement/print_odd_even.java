import java.util.*;

public class print_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("Number is Even");
        } else {
            System.out.print("Number is Odd");
        }
    }
}
