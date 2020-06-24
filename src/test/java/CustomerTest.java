import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.FuelTank;
import vehicles.Bicycle;
import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Engine engine;
    private FuelTank fuelTank;
    private HybridCar hybridCar;
    private Bicycle bicycle;
    private Customer customer;
    private ArrayList<Vehicle> vehicles;

    @Before
    public void before() {
        engine = new Engine(140);
        fuelTank = new FuelTank("Unleaded", 200);
        hybridCar = new HybridCar("Nissan", "Micra", 35000, engine, fuelTank);
        bicycle = new Bicycle("Raleigh", "Motus", 2000);
        vehicles = new ArrayList<Vehicle>();
        Collections.addAll(vehicles, hybridCar, bicycle);
        customer = new Customer("Nathan", 100000, vehicles);
    }
    
    @Test
    public void hasName() {
        assertEquals("Nathan", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(100000, customer.getMoney());
    }

    @Test
    public void hasVehicles() {
        assertEquals(100000, customer.getMoney());
    }

}
