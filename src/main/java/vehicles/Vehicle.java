package vehicles;

public abstract class Vehicle {

    private String manufacturer;
    private String model;
    private int price;
    private int damage;

    public Vehicle(String manufacturer, String model, int price){
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.damage = 0;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price - this.damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void addDamage(int damage){
        if (damage <= getPrice()) {
            this.damage += damage;
        }
    }

    public void repairDamage(){
        this.damage = 0;
    }

}
