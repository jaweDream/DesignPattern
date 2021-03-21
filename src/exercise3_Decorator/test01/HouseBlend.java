package exercise3_Decorator.test01;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
//        this.size = size;
    }

    @Override
    public double cost() {
        if (getSize() == BeverageSize.VENTI){
            return 0.89;
        }else if (getSize() == BeverageSize.GRANDE){
            return 1.89;
        }else{
            return 2.3;
        }
    }

//    @Override
//    public int getSize() {
//        return this.size;
//    }
//
//    @Override
//    public void setSize(int size) {
//        this.size = size;
//    }

}
