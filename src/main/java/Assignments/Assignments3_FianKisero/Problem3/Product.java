package Assignments.Assignments3_FianKisero.Problem3;

import Assignments.Assignments3_FianKisero.Problem3.exceptions.InvalidProductException;
import Assignments.Assignments3_FianKisero.Problem3.exceptions.OutOfStockException;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity)
            throws InvalidProductException {

        if (productId == null || productId.isEmpty())
            throw new InvalidProductException("Product ID cannot be empty");

        if (name == null || name.isEmpty())
            throw new InvalidProductException("Product name cannot be empty");

        if (price <= 0)
            throw new InvalidProductException("Price must be positive");

        if (stockQuantity < 0)
            throw new InvalidProductException("Stock cannot be negative");

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();
    public abstract String getProductType();

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock available");
        }
        stockQuantity -= quantity;
    }

    public double applyTax() {
        return price * 1.16; // 16% VAT
    }

    public void displayProductInfo() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + getProductType());
        System.out.println("Price (with tax): " + applyTax());
        System.out.println("Stock: " + stockQuantity);
    }
}
