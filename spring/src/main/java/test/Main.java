package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.config.DiConfig;

/**
 * Created by xiaobyc on 2018/4/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("id"));
        context.close();
    }
}
