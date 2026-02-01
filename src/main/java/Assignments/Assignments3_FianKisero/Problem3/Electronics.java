package Assignments.Assignments3_FianKisero.Problem3;

import Assignments.Assignments3_FianKisero.Problem3.exceptions.InvalidProductException;

public class Electronics extends Product {
    private int warrantyPeriod;
    private double powerConsumption;

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, double powerConsumption) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    public double calculateDiscount() {
        return price * 0.10;
    }

    public String getProductType() {
        return "Electronics";
    }
}
