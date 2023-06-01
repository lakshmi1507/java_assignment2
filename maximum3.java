import java.util.Scanner;

public class maximum3 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        A = sc.nextInt();
        System.out.println("Enter the value of B");
        B = sc.nextInt();
        System.out.println("Enter the value of C");
        C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println("A is maximum ");

        } else if (B > A && B > C) {
            System.out.println(" B  is maximum ");
        } else {
            System.out.println(" C  is maximum ");
        }

    }
}