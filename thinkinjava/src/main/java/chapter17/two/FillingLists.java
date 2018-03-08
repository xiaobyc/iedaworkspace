package chapter17.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiaobyc on 2017/3/4.
 */
class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s =s;
        System.out.println("s==="+s);
    }

    @Override
    public String toString() {
        return super.toString()+" "+s;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<StringAddress>();
        Collections.nCopies(4, new StringAddress("Hello"));
        System.out.println(list);
        Collections.fill(list,new StringAddress("my Hello"));
        System.out.println("list.size()"+list.size());
        System.out.println(list);
    }
}
