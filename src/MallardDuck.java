public class MallardDuck extends Duck {


    private FlyableBehaviour flyableBehaviour;

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
        quackableBehaviour.quack();
    }

    private QuackableBehaviour quackableBehaviour;
    @Override
    public void display() {
    System.out.println("I'm a mallard duck");
}
public void setMallardDuckFlyable(FlyableBehaviour flyableBehaviour){
        this.flyableBehaviour = flyableBehaviour;
    flyableBehaviour.fly();
}
public void displayFly(){
    System.out.println(this.flyableBehaviour);
}





}
