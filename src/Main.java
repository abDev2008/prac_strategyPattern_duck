//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Duck d = new MallardDuck();
    Squeak s = new Squeak();
    MuteQuack m = new MuteQuack();
    Quack q = new Quack();
    d.setQuackableBehaviour(s);
    d.setQuackableBehaviour(m);
    d.setQuackableBehaviour(q);
    d.display();


    }
}