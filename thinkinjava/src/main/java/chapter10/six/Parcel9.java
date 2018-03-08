package chapter10.six;

import chapter10.four.Destination;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label =dest;

            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9   p = new Parcel9();
        Destination d = p.destination("xiaobyc");
        System.out.println(d.readLabel());
    }
}
