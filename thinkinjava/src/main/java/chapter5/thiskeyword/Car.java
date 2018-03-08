package chapter5.thiskeyword;

/**
 * Created by xiaobyc on 2018/1/22.
 */
public class Car {

    public  void run(){
        System.out.println("runing....");
    }
    public  void stop(){
        System.out.println("stoping...");
    }
    public  void oneTest(){
        run();
    }
    public  void twoTest(){
        this.run();
    }

    public static void main(String[] args) {
            Car car = new Car();
            car.oneTest();
            car.twoTest();
    }
}
