package Loop;

import java.util.*;

public class sum_of_first_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.print(sum);
    }
}
