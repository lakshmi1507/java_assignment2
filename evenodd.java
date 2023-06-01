
import java.util.Scanner;

class evenodd {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(0); // even
        } else {
            System.out.print(1); // odd
        }

    }

}