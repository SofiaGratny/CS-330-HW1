public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void takeOrder(Order order) {
        System.out.println(name + " has taken order #" + order.getOrderNumber() + " for amount: $" + order.getAmount());
    }

    public abstract void makePayment(double amount, PaymentStrategy strategy);
}
