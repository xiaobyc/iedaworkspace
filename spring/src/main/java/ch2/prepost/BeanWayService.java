package ch2.prepost;

/**
 * Created by xiaobyc on 2018/4/23.
 */

public class BeanWayService {
    public  void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
