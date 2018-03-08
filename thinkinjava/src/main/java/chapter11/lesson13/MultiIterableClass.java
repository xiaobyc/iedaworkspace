package chapter11.lesson13;

import java.util.Iterator;

/**
 * Created by xiaobyc on 2017/6/28.
 */
public class MultiIterableClass extends IterableClass {
    public  Iterable<String> reversed(){
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current =words.length-1;

                    public boolean hasNext() {
                        return current>-1;
                    }

                    public String next() {
                        return words[current++];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
