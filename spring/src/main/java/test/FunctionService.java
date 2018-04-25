package test;

import org.springframework.stereotype.Service;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Service
public class FunctionService {
    public String sayHello(String world){
        return "Hello"+world;
    }
}
