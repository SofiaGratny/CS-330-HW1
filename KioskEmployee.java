public class KioskEmployee extends Employee {

    public KioskEmployee(String name) {
        super(name);
    }

    @Override
    public void makePayment(double amount, PaymentStrategy strategy) {
        strategy.pay(amount);
    }
}
