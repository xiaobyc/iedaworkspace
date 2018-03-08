package chapter7.one;

/**
 * Created by xiaobyc on 2017/2/14.
 */
public class Bath {
    private String
    s1="Happy",
    s2 ="Happy",
    s3,s4;
    private Soap soap;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath");
        s3="joy";
        toy =3.14f;
        soap = new Soap();
    }
    {i=47;}

    @Override
    public String toString() {
        if(s4 == null){
            s4 ="joy";
        }
        return "s1 ="+s1+"\n"+
                "s2 ="+s2+"\n"+
                "s3 ="+s3+"\n"+
                "s4 ="+s4+"\n"+
                "i ="+i+"\n"+
                "toy ="+toy+"\n"+
                "soap ="+soap;
    }

    public static void main(String[] args) {
         Bath bath = new Bath();
        System.out.println(bath);
    }
}

class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
