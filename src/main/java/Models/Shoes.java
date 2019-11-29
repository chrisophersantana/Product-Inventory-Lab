package Models;

public class Shoes {
   private int id;
  private   String name;
   private String Brand;
  private   Float size;
   private String sport;
    private int quantity;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
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

    public Shoes(int id, String name, String brand, Float size, String sport, int quantity, double price) {
        this.id = id;
        this.name = name;
        Brand = brand;
        this.size = size;
        this.sport = sport;
        this.quantity = quantity;
        this.price = price;
    }
}
