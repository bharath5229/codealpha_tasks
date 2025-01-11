import java.util.Scanner;

class simplebank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; 
        boolean exit = false;

        System.out.println("Welcome to the Simple Banking Application (task given by Codesoft)");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("INR" + deposit + " deposited successfully!");
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("INR" + withdraw + " withdrawn successfully!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case 3: 
                    System.out.println("Your current balance is INR " + balance);
                    break;

                case 4: 
                    System.out.println("Thank you");
                    exit = true;
                    break;

                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        }
       
    }
}
