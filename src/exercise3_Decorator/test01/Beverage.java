package exercise3_Decorator.test01;

public abstract class Beverage {
    String description= "Unknown Beverage";
    BeverageSize size = BeverageSize.TALL;

    public String getDescription(){
        return description;
    }


    public abstract double cost();
    public void setSize(BeverageSize size){
        this.size = size;
    }

    public BeverageSize getSize(){
        return size;
    }

}
