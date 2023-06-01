import java.util.Scanner;

class triangle {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        A = sc.nextInt();
        System.out.println("Enter value of B");
        B = sc.nextInt();
        System.out.println("Enter value of C");
        C = sc.nextInt();
        if (A == B && B == C) {
            System.out.println("equilateral");
        } else if (A == B || B == C || A == C) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}