package chapter10.seven;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements  ClassInInterface{
        public void howdy() {
            System.out.println("HowDy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
