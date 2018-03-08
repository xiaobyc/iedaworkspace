package chapter7.seven;

/**
 * Created by xiaobyc on 2017/2/15.
 */
class Instrument{
    public void play(){
        System.out.println(".1111111111111111111");
    };
    static void tune(Instrument instrument){
        System.out.println("2222222222222222222");
        instrument.play();;
        System.out.println("333333333333333333333333");
    }
}
public class Wind  extends  Instrument{
    public static void main(String[] args) {
        Wind  wind = new Wind();
        Instrument.tune(wind);
    }
}
