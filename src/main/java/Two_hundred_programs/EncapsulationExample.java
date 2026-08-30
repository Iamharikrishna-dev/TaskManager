package Two_hundred_programs;

class BankAccount2 {
    private double balance;
    void deposit(double amt) { balance += amt; }
    double getBalance() { return balance; }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}