package Assignments.Assignments3_FianKisero.Problem3;

import Assignments.Assignments3_FianKisero.Problem3.exceptions.InvalidProductException;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material, String color) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public double calculateDiscount() {
        return price * 0.20;
    }

    public String getProductType() {
        return "Clothing";
    }
}
