package parts;

public class Engine {

    private int horsepower;

    public Engine(int horsepower){
        this.horsepower = horsepower;
    }

    public int getHorsepower(){
        return this.horsepower;
    }

    public String start(){
        return "Vroom";
    }

    public String stop(){
        return "*Silence*";
    }
}
