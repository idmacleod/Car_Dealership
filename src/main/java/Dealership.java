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

    public MotorVehicle removeFromStock(MotorVehicle motorVehicle) {
        if (this.stock.contains(motorVehicle)) {
            this.stock.remove(motorVehicle);
            return motorVehicle;
        }
        return null;
    }

    public void receiveMoney(int money) {
        this.till += money;
    }

    public void sellToCustomer(MotorVehicle motorVehicle, Customer customer) {
        if (this.stock.contains(motorVehicle)) {
            receiveMoney(motorVehicle.getPrice());
            customer.buy(removeFromStock(motorVehicle));
        }
    }

    public void repairVehicle(MotorVehicle motorVehicle) {
        motorVehicle.repairDamage();
    }

}
