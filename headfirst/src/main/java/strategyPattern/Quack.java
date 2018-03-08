package strategyPattern;

/**
 * Created by xiaobyc on 2018/2/28.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
