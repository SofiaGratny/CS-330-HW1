public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(101, 30.0);
        Order order2 = new Order(102, 40.0);

        Employee kioskEmployee = new KioskEmployee("Delilah");
        kioskEmployee.takeOrder(order1);
        PaymentStrategy cashPayment = new CashPayment(48.0);
        kioskEmployee.makePayment(order1.getAmount(), cashPayment);

        Employee storeEmployee = new StoreEmployee("Oliver");
        storeEmployee.takeOrder(order2);
        PaymentStrategy cardPayment = new CreditCardPayment("1234-5678-9876-5432");
        storeEmployee.makePayment(order2.getAmount(), cardPayment);
    }
}
