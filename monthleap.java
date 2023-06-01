import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class monthleap {
    public static void main(String[] args) {
        int A;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month no");
        A = sc.nextInt();
        if (A == 1 || A == 3 || A == 5 || A == 7 || A == 8 || A == 10 || A == 12)
            System.out.println(31);
        else if (A == 3 || A == 6 || A == 9 || A == 11)
            System.out.println(30);
        else
            System.out.println(28);
    }
}
