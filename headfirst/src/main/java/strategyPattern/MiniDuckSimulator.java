package strategyPattern;

/**
 * Created by xiaobyc on 2018/2/28.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
            Duck duck = new MallardDuck();
            duck.performQuack();
            duck.plerformFly();
    }
}
