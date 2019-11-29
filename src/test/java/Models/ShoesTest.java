package Models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoesTest {

    @Test
    public void constructorTest() {
         int expectedId = 100;
           String expectedName = "cortez";
         String expectedBrand = "Nike";
           int expectedSize = 10;
         String expectedSport = "running";
         int expectedQuantity = 1;
         double expectedPrice = 100.00;

        Shoes testShoes = new Shoes(expectedId, expectedName, expectedBrand, expectedSize, expectedSport, expectedQuantity, expectedPrice);
        Assert.assertEquals(expectedId, testShoes.getId());
        Assert.assertEquals(expectedName, testShoes.getName());
        Assert.assertEquals(expectedBrand, testShoes.getBrand());
        Assert.assertEquals(expectedSize, testShoes.getSize());
        Assert.assertEquals(expectedSport, testShoes.getSport());
        Assert.assertEquals(expectedQuantity , testShoes.getQuantity());
        Assert.assertEquals(expectedPrice , testShoes.getPrice(), 0);
    }

    @Test
    public void setId() {
        int expectedId = 20;

        Shoes shoer = new Shoes(expectedId, "", "", 12, "", 2, 30);
        shoer.setId(24);
        Assert.assertEquals(24, shoer.getId());

    }

    @Test
    public void setName() {
        String expectedName = "Jays";
        Shoes shoer = new Shoes(0, expectedName, "", 12, "", 2, 30);
        shoer.setName("Brons");
        Assert.assertEquals("Brons",shoer.getName());
    }

    @Test
    public void setBrand() {
        String expectedBrand = "Nike";
        Shoes shoer = new Shoes(0, "", expectedBrand, 12, "", 2, 30);
        shoer.setBrand("Adidas");
        Assert.assertEquals("Adidas",shoer.getBrand());

    }

    @Test
    public void setSize() {
        int expectedSize = 12;
        Shoes shoer = new Shoes(0, "", "", 12, "", 2, 30);
        shoer.setSize(9);
        Assert.assertEquals(9,shoer.getSize());
    }

    @Test
    public void setSport() {
        String expectedSport = "running";
        Shoes shoer = new Shoes(0, "", "", 12, "running", 2, 30);
        shoer.setSport("jumping");
        Assert.assertEquals("jumping",shoer.getSport());
    }

    @Test
    public void setQuantity() {
        int expectedQuantity = 2;
        Shoes shoer = new Shoes(0, "", "", 12, "", 2, 30);
        shoer.setQuantity(5);
        Assert.assertEquals(5,shoer.getQuantity());
    }

    @Test
    public void setPrice() {
        int expectedPrice = 30;
        Shoes shoer = new Shoes(0, "", "", 12, "", 2, 30);
        shoer.setPrice(200.00);
        Assert.assertEquals(200.00,shoer.getPrice(), 0);
    }
}