package vehicles;

import parts.Engine;

public abstract class MotorVehicle extends Vehicle{

    private Engine engine;

    public MotorVehicle(String manufacturer, String model, int price, Engine engine){
        super(manufacturer, model, price, engine);

    }
}
