import vehicles.MotorVehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private int till;
    private ArrayList<MotorVehicle> stock;

    public Dealership(String name, int till, ArrayList<MotorVehicle> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    public ArrayList<MotorVehicle> getStock() {
        return this.stock;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(MotorVehicle motorVehicle) {
        this.stock.add(motorVehicle);
    }

    public void spendMoney(int money) {
        if (money <= this.till) {
            this.till -= money;
        }
    }

    public void buy(MotorVehicle motorVehicle) {
        int price = motorVehicle.getPrice();
        if (price <= this.till) {
            addToStock(motorVehicle);
            spendMoney(price);
        }
    }

    public void removeFromStock(MotorVehicle motorVehicle) {
        if (this.stock.contains(motorVehicle)) {
            this.stock.remove(motorVehicle);
        }
    }

    public void receiveMoney(int money) {
        this.till += money;
    }

    public void sell(MotorVehicle motorVehicle) {
        if (this.stock.contains(motorVehicle)) {
            receiveMoney(motorVehicle.getPrice());
            removeFromStock(motorVehicle);
        }
    }

    public void repairVehicle(MotorVehicle motorVehicle) {
        motorVehicle.repairDamage();
    }

}
