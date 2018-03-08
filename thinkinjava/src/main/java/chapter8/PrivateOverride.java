package chapter8;

/**
 * Created by xiaobyc on 2017/2/20.
 */


public class PrivateOverride {
    private void f(){
        System.out.println("PrivateOverride.f()");
    }
    public static void main(String[] args) {
        PrivateOverride  privateOverride = new Derived();
        privateOverride.f();;
    }
}
class Derived extends  PrivateOverride{
    public void f(){
        System.out.println("Derived.f()");
    }
}
