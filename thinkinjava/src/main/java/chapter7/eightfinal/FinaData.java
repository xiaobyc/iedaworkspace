package chapter7.eightfinal;

import java.util.Random;

/**
 * Created by xiaobyc on 2017/2/15.
 */
class Value{
    int i;
    public Value(int i){
        this.i =i;
    }
}
public class FinaData {
    private static Random random = new Random(47);
    private String id;
    public FinaData(String id){
        this.id =id;
    }

    private final int valueOne =9;
    private static final int VALUE_TWO=99;
    public static final  int VALUE_THREE =29;

    private final int i4 =random.nextInt(20);
    static  final  int i5 =random.nextInt(20);
    private  Value v1 = new Value(11);
    private  static  Value v2 = new Value(22);
    private static  final Value V3= new Value(33);
    private final int[] a={1,2,3,4,5,6};

    @Override
    public String toString() {
        return id+":  "+i4+"  :" +i5;
    }

    public static void main(String[] args) {
        FinaData  finaData  = new FinaData("fd1");
    }
}
