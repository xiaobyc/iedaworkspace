package ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaobyc on 2018/4/23.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.pulish("hello event");
        context.close();
    }
}
