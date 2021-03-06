package parts;

public class FuelTank {

    private String fuelType;
    private int capacity;
    private int fuelLevel;

    public FuelTank(String fuelType, int capacity){
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.fuelLevel = 0;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getFuelLevel(){
        return this.fuelLevel;
    }

    public void fillUp(){
        this.fuelLevel = 100;
    }

    public void useFuel(int amount){
        if (amount <= getFuelLevel()) {
            this.fuelLevel -= amount;
        }
    }
}
