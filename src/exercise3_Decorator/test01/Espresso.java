package exercise3_Decorator.test01;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
//        setSize(size);
    }

    @Override
    public double cost() {
//        if (getSize() == 0){
//            return 0.99;
//        }else if (getSize() == 1){
//            return 1.99;
//        }else{
//            return 2.5;
//        }
        return 2.5;
    }
//
//    @Override
//    public int getSize() {
//        return size;
//    }
//
//    @Override
//    public void setSize(int size) {
//        this.size = size;
//    }

}
