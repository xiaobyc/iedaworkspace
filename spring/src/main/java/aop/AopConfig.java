package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
