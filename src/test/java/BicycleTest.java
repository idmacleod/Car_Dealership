import org.junit.Before;
import org.junit.Test;
import vehicles.Bicycle;

import static org.junit.Assert.assertEquals;

public class BicycleTest {

    private Bicycle bicycle;

    @Before
    public void before() {
        bicycle = new Bicycle("Raleigh", "Motus", 2000);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Raleigh", bicycle.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("Motus", bicycle.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, bicycle.getPrice());
    }
    
    @Test
    public void canAddDamage() {
  c yl e  byc
    }

}
