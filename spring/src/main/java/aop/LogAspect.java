package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by xiaobyc on 2018/4/22.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }
    @Before("execution(* aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature  methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method  =methodSignature.getMethod();
        System.out.println("方法规则拦截，"+method.getName());

    }
}
