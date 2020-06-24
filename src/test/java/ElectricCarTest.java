import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    private Engine engine;
    private ElectricCar electricCar;

    @Before
    public void before() {
        engine = new Engine(140);
        electricCar = new ElectricCar("Honda", "Jazz", 30000, engine);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Honda", electricCar.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("Jazz", electricCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(30000, electricCar.getPrice());
    }

    @Test
    public void canAddDamage() {
        electricCar.addDamage(4000);
        assertEquals(4000, electricCar.getDamage());
        assertEquals(26000, electricCar.getPrice());
    }

    @Test
    public void canRepairDamage() {
        electricCar.addDamage(4000);
        electricCar.repairDamage();
        assertEquals(0, electricCar.getDamage());
        assertEquals(30000, electricCar.getPrice());
    }

    @Test
    public void damageCannotExceedPrice() {
        electricCar.addDamage(31000);
        assertEquals(0, electricCar.getDamage());
        assertEquals(30000, electricCar.getPrice());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void hasFullChargeLevel(){
        assertEquals(100, electricCar.getChargeLevel());
    }

    @Test
    public void canUseCharge(){
        electricCar.useCharge(40);
        assertEquals(60, electricCar.getChargeLevel());
    }

    @Test
    public void cannotUseChargeIfLow(){
        electricCar.useCharge(120);
        assertEquals(100, electricCar.getChargeLevel());
    }

    @Test
    public void canRecharge(){
        electricCar.useCharge(20);
        electricCar.recharge();
        assertEquals(100, electricCar.getChargeLevel());
    }
}
