package vehicles;

import parts.Engine;

public class ElectricCar extends MotorVehicle {

    private int chargeLevel;

    public ElectricCar(String manufacturer, String model, int price, Engine engine) {
        super(manufacturer, model, price, engine);
        this.chargeLevel = 100;
    }

    public int getChargeLevel() {
        return this.chargeLevel;
    }

    public void useCharge(int amount) {
        if (amount <= getChargeLevel()) {
            this.chargeLevel -= amount;
        }
    }

    public void recharge() {
        this.chargeLevel = 100;
    }

}
