package OOP;

public class bike extends Vehicle{
    private boolean kidonType;
    public static int count;

    public void setKidonType(boolean kidonType){
        this.kidonType=kidonType;
    }
    public bike(){

    }
    public bike(String name,String color,String model,String company,String engine,boolean kidonType){
        super(name,color,model,company,engine);
        this.kidonType=kidonType;
        count++;
    }
    public String getInfo(){
        return "this is the bike information";
    }
}
