public class MallardDuck extends Duck {
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
