public class Duck {
    public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }

    public FlyableBehaviour getFlyableBehaviour() {
        return flyableBehaviour;
    }

    FlyableBehaviour flyableBehaviour;

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
        quackableBehaviour.quack();
    }

    public QuackableBehaviour getQuackableBehaviour() {
        return quackableBehaviour;
    }
    QuackableBehaviour quackableBehaviour;

    public static void main(String[] args) {
    }
    public void swim(){
        System.out.println("swimming from duck class");
    }
    public void display(){
        System.out.println("displaying from duck class");
    }

}
