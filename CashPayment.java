public class CashPayment implements PaymentStrategy {
    private double cashReceived;

    public CashPayment(double cashReceived) {
        this.cashReceived = cashReceived;
    }

    @Override
    public void pay(double amount) {
        if (cashReceived >= amount) {
            double change = cashReceived - amount;
            System.out.println("Paid $" + amount + " in cash. Change: $" + change);
        } else {
            System.out.println("Insufficient cash provided.");
        }
    }
}
