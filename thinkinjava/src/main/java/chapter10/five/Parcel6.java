package chapter10.five;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackSlip{
                private String id;
                TrackSlip(String s){
                    id =s;
                }
                String getSlip(){
                    return  id;
                }
            }
            TrackSlip ts = new TrackSlip("xiaobyc");
            String s =ts.getSlip();
        }
    }
    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
