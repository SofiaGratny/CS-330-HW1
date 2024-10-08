public class StoreEmployee extends Employee {

    public StoreEmployee(String name) {
        super(name);
    }

    @Override
    public void makePayment(double amount, PaymentStrategy strategy) {
        strategy.pay(amount);
    }
}
