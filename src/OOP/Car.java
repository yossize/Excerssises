package OOP;

public class Car extends Vehicle{
    public boolean ledScreen;
    public boolean powerSteering;

    public Car(String name,String color,String model,String company,String engine,boolean ledScreen,boolean powerSteering){
        super(name,color,model,company,engine);
        this.ledScreen=ledScreen;
        this.powerSteering=powerSteering;
    }
    public String getName(){
        return "the name of your vehiclae is " + super.getName();
    }
    public String getInfo(){
        return "this is the car information";
    }
}
