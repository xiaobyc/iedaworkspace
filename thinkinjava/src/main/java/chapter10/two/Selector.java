package chapter10.two;

/**
 * Created by xiaobyc on 2017/3/4.
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
