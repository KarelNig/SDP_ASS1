package Assignment_1;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double totalAmount = calculateTotalPrice();
        paymentStrategy.processPayment(totalAmount);
    }
}
