import org.junit.Before;
import org.junit.Test;
import parts.FuelTank;

import static org.junit.Assert.assertEquals;

public class FuelTankTest {
    private FuelTank fuelTank;

    @Before
    public void before() {
        fuelTank = new FuelTank("Diesel", 100);
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
    public
}
