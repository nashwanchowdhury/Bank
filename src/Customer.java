public class Customer {
    int balance;
    String name;
    public Customer(int balance, String customerName) {
        this.balance = balance;
        this.name = customerName;
    }
    public void deposit(int x) {
        balance = this.balance + x;
    }
    public void withdrawal(int x) {
        balance = this.balance - x;
    }
    public void account() {
        System.out.println(this.name + "'s account balance is: " + balance);

    }
}
