public class RedheadDuck extends Duck{
    private FlyableBehaviour flyableBehaviour;

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
        quackableBehaviour.quack();
    }

    private QuackableBehaviour quackableBehaviour;
    @Override
    public void display() {
        System.out.println("I'm a RedHead duck");
    }
}
