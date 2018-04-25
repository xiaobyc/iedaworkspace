package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaobyc on 2018/4/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        
        DemoPrototypeService  prototypeService = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        System.out.println(singletonService.equals(singletonService1));
        System.out.println(prototypeService.equals(prototypeService1));
        context.close();
    }
}
