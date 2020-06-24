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
        bicycle.addDamage(500);
        assertEquals(500, bicycle.getDamage());
        assertEquals(1500, bicycle.getPrice());
    }

    @Test
    public void canRepairDamage() {
        bicycle.addDamage(500);
        bicycle.repairDamage();
        assertEquals(0, bicycle.getDamage());
        assertEquals(2000, bicycle.getPrice());
    }

    @Test
    public void damageCannotExceedPrice() {
        bicycle.addDamage(2500);
        assertEquals(0, bicycle.getDamage());
        assertEquals(2000, bicycle.getPrice());
    }

}
