package Services;

import Models.Shoes;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ShoeServiceTest {
    @Test
    public void createTest(){

        int expectedId = 2;
        String expectedName = "Yeezy";
        String expectedBrand = "Adidas";
        String expectedSport = "Flexing";
        int expectedSize = 10;
        int expectedQty = 10;
        double expectedPrice = 450.00;


        ShoesServices shoesServices = new ShoesServices();
        Shoes testShoe = shoesServices.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);


        int actualId = testShoe.getId();
        String actualName = testShoe.getName();
        String actualBrand = testShoe.getBrand();
        String actualSport = testShoe.getSport();
        int actualSize = testShoe.getSize();
        int actualQty = testShoe.getQuantity();
        double actualPrice = testShoe.getPrice();


        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice ,0);

    }
}
