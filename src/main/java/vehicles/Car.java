package vehicles;

import parts.Engine;

public class Car extends MotorVehicle {

    public Car(String manufacturer, String model, int price, Engine engine){
        super(manufacturer, model, price, engine);
    }
}
