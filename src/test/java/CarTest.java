import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Car car;

    @Before
    public void before() {
        engine = new Engine(140);
        car = new Car("Ford", "Mondeo", 24000, engine);
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



}
