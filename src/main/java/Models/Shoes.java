package Models;

import java.util.ArrayList;
import java.util.List;

public class Shoes {
    private int id;
    private String name;
    private String Brand;
    private int size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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

    public Shoes(int id, String name, String brand, int size, String sport, int quantity, double price) {
        this.id = id;
        this.name = name;
        Brand = brand;
        this.size = size;
        this.sport = sport;
        this.quantity = quantity;
        this.price = price;
    }
}

//    List<Shoes> shoesList = new ArrayList<Shoes>();
//
//    Shoes s1 = new Shoes(2,"Retros", "Jays", 10, "Hiking", 1, 99.00);
//    Shoes s2 = new Shoes(4, "SB", "Nike", 8, "Running", 3, 80.00);
//    Shoes s3 = new Shoes(1, "Yeezy", "Adidas", 9, "Flexing", 8,450.00);
//
//shoesList.add(s1);
//shoesList.add(s2);
//shoesList.add(s3);
//}
