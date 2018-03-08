package chapter10.seven;

import chapter10.four.Contents;
import chapter10.four.Destination;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel11 {
    private  static  class ParcelContents implements Contents{
        private int i =11;
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    public static  void f(){};
        static  int x =10;
        static  class AnotherLevel{
            public static void  f(){
                System.out.println("xxx="+x);
            }
            static int x =11;
        }
    }
    public static  Destination destination(String s){
        return  new ParcelDestination(s);
    }
    public static Contents contents(){
        return  new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("xiaobyc");

    }

}
