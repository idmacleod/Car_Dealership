import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, int money, ArrayList<Vehicle> vehicles){
        this.name = name;
        this.money = money;
        this.vehicles = vehicles;
    }

    public String getName(){
        return this.name;
    }

    public int getMoney(){
        return this.money;
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }

    public void addToVehicles(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int getVehicleCount(){
        return this.vehicles.size();
    }

    public void spendMoney(int money){
        if (money <= this.money)
        this.money -= money;
    }

    public void buy(Vehicle vehicle){
        if (vehicle.getPrice() <= this.money)
        addToVehicles(vehicle);
        spendMoney(vehicle.getPrice());
    }
}
