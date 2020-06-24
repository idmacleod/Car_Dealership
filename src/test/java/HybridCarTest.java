import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.FuelTank;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private Engine engine;
    private FuelTank fuelTank;
    private HybridCar hybridCar;

    @Before
    public void before() {
        engine = new Engine(140);
        fuelTank = new FuelTank("Unleaded", 200);
        hybridCar = new HybridCar("Nissan", "Micra", 35000, engine, fuelTank);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Nissan", hybridCar.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("Micra", hybridCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(35000, hybridCar.getPrice());
    }

    @Test
    public void canAddDamage() {
        hybridCar.addDamage(5000);
        assertEquals(5000, hybridCar.getDamage());
        assertEquals(30000, hybridCar.getPrice());
    }

    @Test
    public void canRepairDamage() {
        hybridCar.addDamage(5000);
        hybridCar.repairDamage();
        assertEquals(0, hybridCar.getDamage());
        assertEquals(35000, hybridCar.getPrice());
    }

    @Test
    public void damageCannotExceedPrice() {
        hybridCar.addDamage(36000);
        assertEquals(0, hybridCar.getDamage());
        assertEquals(35000, hybridCar.getPrice());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasFuelTank(){
        assertEquals(fuelTank, hybridCar.getFuelTank());
    }

    @Test
    public void hasFullChargeLevel(){
        assertEquals(100, hybridCar.getChargeLevel());
    }

    @Test
    public void canUseCharge(){
        hybridCar.useCharge(40);
        assertEquals(60, hybridCar.getChargeLevel());
    }

    @Test
    public void cannotUseChargeIfLow(){
        hybridCar.useCharge(120);
        assertEquals(100, hybridCar.getChargeLevel());
    }

    @Test
    public void canRecharge(){
        hybridCar.useCharge(20);
        hybridCar.recharge();
        assertEquals(100, hybridCar.getChargeLevel());
    }
}
