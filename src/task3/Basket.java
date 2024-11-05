package task3;

public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}




