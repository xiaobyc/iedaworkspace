package chapter10.eight;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public abstract class Event {
    private long eventTime;
    protected  final long delayTime;
    public Event(long delayTime){
        this.delayTime =delayTime;
    }
    public void start(){
        eventTime = System.currentTimeMillis()+eventTime;
    }
    public boolean ready(){
        return System.nanoTime()>=eventTime;
    }
    public abstract  void action();
}
