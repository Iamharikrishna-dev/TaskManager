package Two_hundred_programs;

class InsufficientFundsException2 extends Exception {
    InsufficientFundsException2(String msg) { super(msg); }
}
public class CustomCheckedExceptionExample {
    static void withdraw(double balance, double amount) throws InsufficientFundsException2 {
        if (amount > balance) throw new InsufficientFundsException2("Insufficient funds");
        System.out.println("Withdrawal successful");
    }
    public static void main(String[] args) {
        try {
            withdraw(100, 200);
        } catch (InsufficientFundsException2 e) {
            System.out.println(e.getMessage());
        }
    }
}