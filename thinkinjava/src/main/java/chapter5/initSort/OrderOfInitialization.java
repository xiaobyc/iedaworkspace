package chapter5.initSort;

/**
 * Created by xiaobyc on 2017/2/8.
 */

class Window{
    Window(int marker){
        System.out.println("Window ("+marker+")");
    }
}
class House {
    Window  w1 = new Window(1);
    House(){
        System.out.println("house()");
        w3 = new Window(33);
    }
    Window  w2 = new Window(2);
    void f(){
        System.out.println("f()...");
    };
    Window w3 = new Window(3);
}
public class OrderOfInitialization {

    public static void main(String[] args) {
         House  house = new House();
         house.f();
    }
}


