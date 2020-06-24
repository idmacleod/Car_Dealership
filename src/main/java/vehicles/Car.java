package vehicles;

import parts.Engine;
import parts.FuelTank;

public class Car extends MotorVehicle {

    private FuelTank fuelTank;

    public Car(String manufacturer, String model, int price, Engine engine, FuelTank fuelTank){
        super(manufacturer, model, price, engine);
        this.fuelTank = fuelTank;
    }

    public FuelTank getFuelTank(){
        return this.fuelTank;
    }
}
