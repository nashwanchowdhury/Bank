public class Customer {
    int balance;
    String name;
    int number;
    public Customer(int balance, String customerName, int accountnumber) {
        this.balance = balance;
        this.name = customerName;
        this.number = accountnumber;
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
