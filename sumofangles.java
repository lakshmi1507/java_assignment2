import java.util.Scanner;

class sumofangles {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        A = sc.nextInt();
        System.out.println("Enter value of B");
        B = sc.nextInt();
        System.out.println("Enter value of C");
        C = sc.nextInt();
        if (A + B + C == 180) {
            System.out.println(1); // equal to 180

        } else {
            System.out.println(0); // not equal to 180
        }
    }
}