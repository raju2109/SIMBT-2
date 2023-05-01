import java.util.Scanner;

 class ATM {
    private static int balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    public static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Your new balance is: $" + balance);
    }

    public static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful! Your new balance is: $" + balance);
    }
}
