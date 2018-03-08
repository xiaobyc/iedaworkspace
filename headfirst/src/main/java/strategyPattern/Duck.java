package strategyPattern;

/**
 * Created by xiaobyc on 2018/2/28.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public  abstract  void display();
    public void plerformFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }
}
