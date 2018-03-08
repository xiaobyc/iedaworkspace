package chapter7.two;

/**
 * Created by xiaobyc on 2017/2/14.
 */
public class Cleanser {
    private String s ="Cleanser";
    public void append(String a){
        s+=a;
    }
    public void dilute(){
        append("dilute()");
    }
    public void apply(){
        append("apply");
    }
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();;
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}
