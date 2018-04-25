package ch2.prepost;

import javax.annotation.PostConstruct;

/**
 * Created by xiaobyc on 2018/4/23.
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PostConstruct
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
