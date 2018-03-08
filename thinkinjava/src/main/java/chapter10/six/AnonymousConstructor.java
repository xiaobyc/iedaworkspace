package chapter10.six;

/**
 * Created by xiaobyc on 2017/3/5.
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base.constructor.i="+i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return  new Base(i){
            private int label;
            {

                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(46);
        base.f();
    }
}
