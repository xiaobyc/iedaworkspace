package strategyPattern;

/**
 * Created by xiaobyc on 2018/2/28.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying ...");
    }
}
