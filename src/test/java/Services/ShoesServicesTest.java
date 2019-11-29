package Services;

import Models.Shoes;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoesServicesTest {

    @Test
    public void findAll() {
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        ShoesServices shoesServices = new ShoesServices();
        Shoes testShoe = shoesServices.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        Shoes actual = shoesServices.findShoes(1);
        assertEquals(actual,testShoe);

    }

    @Test
    public void delete() {
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        double expectedPrice = 80.00;

        // (2)
        ShoesServices shoesServices = new ShoesServices();
        shoesServices.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);


        assertTrue(shoesServices.delete(1));

    }
}