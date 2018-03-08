package chapter10.eight;

/**
 * Created by xiaobyc on 2017/3/5.
 */
interface  Incrementable{
    void increment();
}
class Calleel implements Incrementable{
    private int i =0;
    public void increment() {
        i++;
        System.out.println("Calleel i="+i);
    }
}
class MyIncrement{
    public void increment(){
        System.out.println("other.operation");
    }
    static void  f(MyIncrement myIncrement){
        myIncrement.increment();
    }
}
class Callee2 extends MyIncrement{
    private int i=0;
    public void  increment(){
        super.increment();
        int j =i++;
        System.out.println("callee2 i="+i+"j ="+j);
    }
    private class Closure implements Incrementable{
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return  new Closure();
    }
}
class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable callbackReference){
        this.callbackReference =callbackReference;
    }
    void go(){
        callbackReference.increment();
    }
}
public class Callbacks {
    public static void main(String[] args) {
        Calleel calleel = new Calleel();
        Callee2 callee2 = new Callee2();
        MyIncrement.f(callee2);
        System.out.println("111111111111111111111111");
        Caller caller1 = new Caller(calleel);
        Caller caller2 = new Caller(callee2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
