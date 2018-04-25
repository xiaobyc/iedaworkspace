package ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by xiaobyc on 2018/4/23.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public DemoListener() {
        super();
    }

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息："+msg);
    }
}
