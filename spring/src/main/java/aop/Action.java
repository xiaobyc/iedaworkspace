package aop;

import java.lang.annotation.*;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
