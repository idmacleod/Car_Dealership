package vehicles;

public abstract class Vehicle {

    private String manufacturer;
    private String model;
    private int price;
    private int damage;

    public Vehicle(String manufacturer, String model, int price, int damage){
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.damage = damage;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }

    public int getDamage(){
        return this.damage;
    }

    public void addDamage(int damage){
        this.damage += damage;
    }

    public void repairDamage(int damage){
        this.damage -= damage;
    }

    public void reducePrice(int reduction){
        this.price -= reduction;
    }


}
