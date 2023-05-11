public class Product {
    int cost;
    int quantity;
    String name;
    public Product(int cost, int quantity, String prodname) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = prodname;
    }
    public void totalCost() {
        int totalcost = this.cost * this.quantity;
        System.out.println("Total cost is $" + totalcost);
    }
    public void printProduct() {
        System.out.println("Each " + this.name + " costs $" + this.cost + " and " + this.quantity + " units were purchased" );
    }
}
