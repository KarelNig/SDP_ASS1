package Assignment_1;

public class main {
    public static void main(String[] args){
        Product product1 = new Product("Protein",150);
        Product product2 = new Product("Creatin", 50);
        Product product3 = new Product("BCAA",60);

        ShoppingCart cart = new  ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("Card Total: $" + cart.calculateTotalPrice());

    }
}
