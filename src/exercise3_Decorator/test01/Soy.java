package exercise3_Decorator.test01;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",soy";
    }

    @Override
    public double cost() {
//        if (getSize()==0){
//            return 0.11+beverage.cost();
//        }else if(getSize()==1){
//            return 0.13+beverage.cost();
//        }else{
//            return 0.15+beverage.cost();
//        }
        return 0.15+beverage.cost();

    }

//    @Override
//    public int getSize() {
//        return beverage.getSize();
//    }
}
