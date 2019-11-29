package Models;

import org.junit.Assert;
import org.junit.Test;



public class BeerTest {

    @Test
    public void constructorTest() {
        int expectedId = 100;
        String expectedType = "Dark";
        String expectedBrand = "Modelo";
        int expectedQuantity = 1;
        double expectedPrice = 100.00;

        Beer chela = new Beer(expectedId, expectedType, expectedBrand, expectedQuantity, expectedPrice);
        Assert.assertEquals(expectedId, chela.getId());
        Assert.assertEquals(expectedType, chela.getType());
        Assert.assertEquals(expectedBrand, chela.getBrand());
        Assert.assertEquals(expectedQuantity, chela.getQuantity());
        Assert.assertEquals(expectedPrice, chela.getPrice(), 0);


    }
    @Test
    public void setId(){

        int expectedIds = 20;
            Beer chela = new Beer(expectedIds, "", "", 00, 00.00);
            chela.setId(24);
            Assert.assertEquals(24, chela.getId());

    }

    @Test
    public void setType() {
        String expectedType = "Clara";
        Beer chela = new Beer(0, expectedType, "", 00, 00.00);
        chela.setType("Dark");
        Assert.assertEquals("Dark", chela.getType());

    }

    @Test
    public void setBrand() {
        String expectedBrand = "Corona";
        Beer chela = new Beer(0, "", expectedBrand, 00, 00.00);
        chela.setBrand("Modelo");
        Assert.assertEquals("Modelo", chela.getBrand());
    }

    @Test
    public void setQuantity() {
        int expectedQuantity = 4;

        Beer chela = new Beer(0, "", "", expectedQuantity, 00.00);
        chela.setQuantity(24);
        Assert.assertEquals(24, chela.getQuantity());
    }

    @Test
    public void setPrice() {
        Double expectedPrice = 20.00;
        Beer chela = new Beer(0, "", "", 00, expectedPrice);
        chela.setPrice(19.00);
        Assert.assertEquals(19.00, chela.getPrice(), 0);
    }
}
