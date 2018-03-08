package chapter11.lesson13;

import java.util.Map;

/**
 * Created by xiaobyc on 2017/6/28.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }
    }
}
