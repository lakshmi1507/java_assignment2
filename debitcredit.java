import java.util.Scanner;

class debitcredit {
    public static void main(String[] args) {
        int Amount, intial_balance, type, cash;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intial_balance");
        intial_balance = sc.nextInt();
        System.out.println("cash");
        cash = sc.nextInt();
        System.out.println("Enter type");
        type = sc.nextInt();
        if (type == 2) {
            if (intial_balance < cash) {
                System.out.println("Insuffienct balance");
            }
            Amount = intial_balance - cash;
            System.out.println(Amount);
        }
        else if(type == 1)
        {
            Amount = intial_balance + cash;
            System.out.println(Amount);
        }
}
}
