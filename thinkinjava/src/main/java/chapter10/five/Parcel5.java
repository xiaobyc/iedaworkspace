package chapter10.five;


import chapter10.four.Destination;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel5 {
    public Destination desctination(String s){
        class PDestination implements Destination {
            private String label;

            public PDestination(String label) {
                this.label = label;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d =p.desctination("xiaobyc");

    }
}
