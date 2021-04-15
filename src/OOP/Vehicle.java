package OOP;

public class Vehicle {
    private String name="";
    private String color="";
    private String model="";
    private String company="";
    private String engine="";
    public static int count=0;

    public Vehicle(String name,String color,String model,String company,String engine){
        this.name=name;
        this.color=color;
        this.model=model;
        this.company=company;
        this.engine=engine;
        count++;
    }
    public Vehicle(){
        count++;
    }
    public void printVehicle(){
        System.out.println("name "+this.name+" color " + this.color+" model "+this.model+" company "+this.company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }
    private String getEngine(){
        return this.engine;
    }
    public int getSpeed(){
        if(getEngine()=="800"){
            return 90;
        }else{
            return 120;
        }
    }
    public static String getCount(){
        return "you called getCount";
    }
    public String getInfo(){
        return "this is vehicle information";
    }
}
