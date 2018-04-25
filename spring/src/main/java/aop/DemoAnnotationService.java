package aop;

import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
    }
}
