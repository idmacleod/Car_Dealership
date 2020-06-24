package parts;

public class FuelTank {

    private String fuelType;
    private int capacity;
    private int fuelLevel;

    public FuelTank(String fuelType, int capacity, int fuelLevel){
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.fuelLevel = fuelLevel;
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
        this.fuelLevel -= amount;
    }
}
