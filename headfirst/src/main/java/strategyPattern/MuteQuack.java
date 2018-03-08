package strategyPattern;

/**
 * Created by xiaobyc on 2018/2/28.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
