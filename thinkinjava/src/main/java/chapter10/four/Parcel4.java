package chapter10.four;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel4 {
    private class PContents implements Contents{
        private int i =11;
        public int value() {
            return i;
        }
    }
    protected class PDestinatioin implements  Destination{
        private String label;

        public PDestinatioin(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }
    public Contents contents(){
        return new PContents();
    }
    public Destination destiation(String s){
        return new PDestinatioin(s);
    }

    public static void main(String[] args) {
        Parcel4  p  = new Parcel4();
        Contents  c =p.contents();
        Destination d =p.destiation("xiaobyc");

    }
}
