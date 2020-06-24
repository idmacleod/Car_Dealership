import org.junit.Before;
import org.junit.Test;
import parts.FuelTank;

import static org.junit.Assert.assertEquals;

public class FuelTankTest {
    private FuelTank fuelTank;

    @Before
    public void before() {
        fuelTank = new FuelTank("Diesel", 100, 0);
    }

    @Test
    public void hasFuelType() {
        assertEquals("Diesel", fuelTank.getFuelType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, fuelTank.getCapacity());
    }

    @Test
    public void fuelLevelStartsAtZero() {
        assertEquals(0, fuelTank.getFuelLevel());
    }

    @Test
    public void canFillUp() {
        fuelTank.fillUp();
        assertEquals(50, fuelTank.getFuelLevel());
    }

    @Test
    public void canUseFuel() {

    }
}
