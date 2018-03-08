package chapter10.one;


/**
 * Created by xiaobyc on 2017/3/4.
 */
public class Parcel1 {
    class Contents{
        private int i =11;
        public int vaule(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination (String whereTo){
            label =whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents  contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("xiaobyc");
    }
}
