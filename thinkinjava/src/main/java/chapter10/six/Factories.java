package chapter10.six;

/**
 * Created by xiaobyc on 2017/3/5.
 */
interface  Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    public void method1() {
        System.out.println("Implementation1.method1");
    }

    public void method2() {
        System.out.println("Implementation1.method2");
    }
    public static ServiceFactory  factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}
class Implementation2 implements Service{
    public Implementation2() {
        super();
    }

    public void method1() {
        System.out.println("Implementation2.method2");
    }

    public void method2() {
        System.out.println("Implementation2.method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new  Implementation2();
        }
    };
}
public class Factories {
    public static  void serviceConsumer(ServiceFactory factory){
        Service  service =factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
