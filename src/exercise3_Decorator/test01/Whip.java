package exercise3_Decorator.test01;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",whip";
    }

    @Override
    public double cost() {
        return 0.22+beverage.cost();
    }
//
//    @Override
//    public int getSize() {
//        return beverage.getSize();
//    }
}
