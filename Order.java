public class Order {
    private int orderNumber;
    private double amount;

    public Order(int orderNumber, double amount) {
        this.orderNumber = orderNumber;
        this.amount = amount;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order #" + orderNumber + ": Amount = $" + amount;
    }
}
