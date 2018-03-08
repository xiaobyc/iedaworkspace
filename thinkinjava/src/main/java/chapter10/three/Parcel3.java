package chapter10.three;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel3 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3  parcel3 = new Parcel3();
        Parcel3.Contents c = parcel3.new Contents();
        Parcel3.Destination d = parcel3.new Destination("xiaobyc");
        System.out.println(d.readLabel());
    }
}
