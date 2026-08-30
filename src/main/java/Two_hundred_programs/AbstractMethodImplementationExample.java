package Two_hundred_programs;

abstract class Payment2 { abstract void pay(double amount); }
class CreditCardPayment2 extends Payment2 {
    void pay(double amount) { System.out.println("Paid " + amount + " via credit card"); }
}
public class AbstractMethodImplementationExample {
    public static void main(String[] args) {
        Payment2 p = new CreditCardPayment2();
        p.pay(250.0);
    }
}