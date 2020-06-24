import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.FuelTank;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private FuelTank fuelTank;
    private Car car;

    @Before
    public void before() {
        engine = new Engine(140);
        fuelTank = new FuelTank("Unleaded", 100);
        car = new Car("Ford", "Mondeo", 24000, engine, fuelTank);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Ford", car.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("Mondeo", car.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(24000, car.getPrice());
    }

    @Test
    public void canAddDamage() {
        car.addDamage(4000);
        assertEquals(4000, car.getDamage());
        assertEquals(20000, car.getPrice());
    }

    @Test
    public void canRepairDamage() {
        car.addDamage(4000);
        car.repairDamage();
        assertEquals(0, car.getDamage());
        assertEquals(24000, car.getPrice());
    }

    @Test
    public void damageCannotExceedPrice() {
        car.addDamage(25000);
        assertEquals(0, car.getDamage());
        assertEquals(24000, car.getPrice());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasFuelTank() {
        assertEquals(fuelTank, car.getFuelTank());
    }
}
