import java.util.Scanner;

class bankaccount {
    private double bal;

    public bankaccount(double bal) {
        this.bal = bal;
    }

    public double deposit(double amt) {
        bal += amt;
        return bal;
    }

    public double withdraw(double amt) {
        if (amt > bal) {
            System.out.println("Insufficient balance");
            return bal;
        }
        bal -= amt;
        return bal;
    }

    public double checkBalance() {
        return bal;
    }
}

class atminterface {
    private bankaccount account;
    private Scanner scanner;

    public atminterface(bankaccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("::::Welcome to ATM Interface::::");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option from above: ");
            int option = scanner.nextInt();
            // switch case using for chosing options
            switch (option) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("***Exiting***");
                    return;
                default:
                    System.out.println("**Invalid option Please choose again**.");
            }
        }
    }

    // Methods
    private void checkBalance() {
        double bal = account.checkBalance();
        System.out.println("Current balance: " + bal);
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        double newbal = account.withdraw(amount);
        System.out.println("New balance: " + newbal);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amt = scanner.nextDouble();
        double newbal = account.deposit(amt);
        System.out.println("New balance: " + newbal);
    }

    public static void main(String[] args) {
        bankaccount account = new bankaccount(1000.0);
        atminterface atm = new atminterface(account);
        atm.run();
    }
}
