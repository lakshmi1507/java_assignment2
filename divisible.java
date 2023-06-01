import java.util.Scanner;

class divisible {
    public static void main(String[] args) {
        int A;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        A = sc.nextInt();
        if (A % 5 == 0 && A % 11 == 0) {
            System.out.println(1); // divisible by both 5 and 11

        } else {
            System.out.println(0); // not divisible by both
        }
    }
}