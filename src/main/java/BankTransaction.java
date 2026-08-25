import java.util.ArrayList;
import java.util.List;

public class BankTransaction {

    public static void main(String[] args) {
        double balance = 1000.00;
        List<String> statements = new ArrayList<>();

        statements.add("Initial balance: $1000.00");
        System.out.println("Welcome to the Bank Application");

        if (args.length < 1) {
            System.out.println("Please enter the amount you would like to transfer from");
            System.out.println("\n choice 1 and 2 pass 1 args example : java BankTransaction 2\n choice 3 pass 2 args example : java BankTransaction 3 200");
            return;
        }
        int choice = Integer.parseInt(args[0]);
        if (choice == 1) {
            System.out.println("Your current balance is: $" + balance);
        }
        else if (choice == 2) {
            System.out.println("--- Account Statements ---");
            for (String statement : statements) {
                System.out.println(statement);
            }
        }
        else if (choice == 3) {

            if (args.length != 2) {
                System.out.println("Please enter deposit amount.");
                System.out.println("choice 3 pass 2 args example : java BankTransaction 3 200 or choice 1 and 2 pass 1 args example : java BankTransaction 1");
                return;
            }

            double depositAmount = Double.parseDouble(args[1]);

            if (depositAmount > 0) {
                balance = balance + depositAmount;
                statements.add("Deposited: $" + depositAmount + " | New Balance: $" + balance);
                System.out.println("Deposited : $" + depositAmount);
                System.out.println("Your current balance is: $" + balance);
                System.out.println("Deposit successful!");
            } else {
                System.out.println("Invalid amount. Deposit must be greater than 0.");
            }
        }
        else if (choice == 4) {
            System.out.println("Thank you for using our bank. Goodbye!");
        }
        else {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }
}