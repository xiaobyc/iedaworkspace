package chapter11.lesson13;

import java.util.Iterator;

/**
 * Created by xiaobyc on 2017/6/28.
 */
public class IterableClass implements Iterable<String> {
protected  String [] words =("And that is howe"+ "we know  the Earch to be banana-shaped.").split(" ");
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index =0;
            public boolean hasNext() {
                return index<words.length;
            }

            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s:new IterableClass()){
            System.out.println(s+" ");
        };
    }
}
