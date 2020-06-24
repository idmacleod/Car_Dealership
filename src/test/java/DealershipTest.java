import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.FuelTank;
import vehicles.*;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private ArrayList<MotorVehicle> stock;
    private Engine engine1;
    private Engine engine2;
    private Engine engine3;
    private FuelTank fuelTank1;
    private FuelTank fuelTank2;
    private HybridCar hybridCar;
    private ElectricCar electricCar;
    private Car car;

    @Before
    public void before(){
        engine1 = new Engine(140);
        engine2 = new Engine(150);
        engine3 = new Engine(200);
        fuelTank1 = new FuelTank("Unleaded", 200);
        fuelTank2 = new FuelTank("Diesel", 200);
        electricCar = new ElectricCar("Ford", "Focus", 25000, engine1);
        hybridCar = new HybridCar("Nissan", "Micra", 35000, engine2, fuelTank1);
        car = new Car("Renault", "5", 40000, engine3, fuelTank2);
        stock = new ArrayList<MotorVehicle>();
        Collections.addAll(stock, electricCar, hybridCar, car);
        dealership = new Dealership("Donny's Dynamite Dealership", 500000, stock);
    }

    @Test
    public void hasName() {
        assertEquals("Donny's Dynamite Dealership", dealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(500000, dealership.getTill());
    }

    @Test
    public void hasStock() {
        assertEquals(stock, dealership.getStock());
    }

    @Test
    public void canGetStockCount(){
        assertEquals(3, dealership.getStockCount());
    }

    @Test
    public void canAddToStock(){
        Car weeCar = new Car("Mini", "Cooper", 15000, engine1, fuelTank1);
        dealership.addToStock(weeCar);
        assertEquals(4, dealership.getStockCount());
    }

    @Test
    public void canSpendMoney(){
        dealership.spendMoney(300000);
        assertEquals(200000, dealership.getTill());
    }

    @Test
    public void canBuyCar(){
        Car weeCar = new Car("Mini", "Cooper", 15000, engine1, fuelTank1);
        dealership.buy(weeCar);
        assertEquals(485000, dealership.getTill());
        assertEquals(4, dealership.getStockCount());
    }

    @Test
    public void cannotBuyCarIfTooExpensive(){
        Car solidGoldCar = new Car("Lexus", "Gold", 600000000, engine1, fuelTank1);
        dealership.buy(solidGoldCar);
        assertEquals(500000, dealership.getTill());
        assertEquals(3, dealership.getStockCount());
    }

    @Test
    public void canReceiveMoney(){
        dealership.receiveMoney(20000);
        assertEquals(520000, dealership.getTill());
    }

    @Test
    public void canRemoveFromStock(){
        dealership.removeFromStock(car);
        assertEquals(2, dealership.getStockCount());
    }

    @Test
    public void canSellVehicle(){
        dealership.sell(car);
        assertEquals(540000, dealership.getTill());
        assertEquals(2, dealership.getStockCount());
    }

    @Test
    public void cannotRemoveFromStockIfNotInStock(){
        HybridCar newHybridCar = new HybridCar("Nissan", "Micra", 20000, engine3, fuelTank1);
        dealership.removeFromStock(newHybridCar);
        assertEquals(3, dealership.getStockCount());
    }

    @Test
    public void cannotSellVehicleIfNotInStock(){
        HybridCar newHybridCar = new HybridCar("Nissan", "Micra", 20000, engine3, fuelTank1);
        dealership.sell(newHybridCar);
        assertEquals(500000, dealership.getTill());
        assertEquals(3, dealership.getStockCount());
    }

    @Test
    public void canRepairVehicle(){
        HybridCar newHybridCar = new HybridCar("Nissan", "Micra", 20000, engine3, fuelTank1);
        newHybridCar.addDamage(5000);
        dealership.repairVehicle(newHybridCar);
        assertEquals(20000, newHybridCar.getPrice());
        assertEquals(0, newHybridCar.getDamage());
    }
}
