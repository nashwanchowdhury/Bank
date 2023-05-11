
public class BankAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(500, "Dale");
        Customer customer2 = new Customer(5000, "Glen");
        Customer customer3 = new Customer(300, "Sarah");
        Product product = new Product(10, 10, "iPhone 40 Pro Max");
        customer.deposit(100);
        customer.account();
        customer.withdrawal(100);
        customer2.deposit(100);
        customer2.account();
        customer3.account();
        customer.account();
        product.printProduct();
        product.totalCost();
        }
    }
