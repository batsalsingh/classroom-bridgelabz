package Object_modeling;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - $" + price);
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order Details:");
        double total = 0;
        for (Product p : products) {
            p.display();
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class CustomerE {
    private String name;

    public CustomerE(String name) {
        this.name = name;
    }

    public Order placeOrder() {
        System.out.println(name + " is placing an order...");
        return new Order();
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        CustomerE c = new CustomerE("Alice");

        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Phone", 500);

        Order order = c.placeOrder();
        order.addProduct(p1);
        order.addProduct(p2);

        order.showOrder();
    }
}
