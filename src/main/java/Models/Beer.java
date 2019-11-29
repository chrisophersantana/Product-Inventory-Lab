package Models;

public class Beer {
    private int id;
    private   String type;
    private String Brand;
    private int quantity;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Beer(int id, String type, String brand, int quantity, double price) {
        this.id = id;
        this.type = type;
        Brand = brand;
        this.quantity = quantity;
        this.price = price;
    }
}
