package chapter8.eightthree;

/**
 * Created by xiaobyc on 2017/6/19.
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius =1;
    RoundGlyph( int r){
        radius =r;
        System.out.println("RoundsGlyph.RoundGlyph(), radius ="+radius);

    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius ="+radius);
    }
}

public class PloyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }

}
