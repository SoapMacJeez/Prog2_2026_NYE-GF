public class CoffeMachine {
    private String brand;
    private double price; //HUF/dl
    private double quantity;
    private final double full_tank;
    public CoffeMachine(String brand, double price, double quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.full_tank = quantity;
    }

    private void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double buy(double amount) {
        if (amount > quantity) {
            return  -1;
        } else {
            setQuantity(quantity - amount);
            return amount * price;
        }
    }

    public double fill() {
        double toBeFilled = full_tank - quantity;
        setQuantity(full_tank);
        return toBeFilled;
    }

    public String toString() {
        return String.format(
                "Brand: %s\nPrice: %.2f Ft.\nQuantity: %.2f dl\nFull Tank: %.2f",
                brand, price, quantity, full_tank
        );
    }
}
