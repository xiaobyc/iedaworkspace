package chapter8.eightone;

/**
 * Created by xiaobyc on 2017/6/18.
 */
class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}
class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() "+n);
    }
}

public class MuSic {
    public static  void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
