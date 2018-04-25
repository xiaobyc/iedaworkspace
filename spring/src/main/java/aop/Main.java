package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaobyc on 2018/4/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = configApplicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = configApplicationContext.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        configApplicationContext.close();
    }
}
