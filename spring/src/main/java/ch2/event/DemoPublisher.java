package ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by xiaobyc on 2018/4/23.
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext  applicationContext;
    public void pulish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
