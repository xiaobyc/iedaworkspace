package chapter8;

/**
 * Created by xiaobyc on 2017/2/20.
 */
public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("croaks");
    private Description description = new Description("Eats Bus");
    public Frog(){
        System.out.println("Frog");
    }
    protected void dispose(){
        System.out.println("Frog dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("bye!");
        frog.dispose();
    }
}
class Characteristic {
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("creating Characteristic "+s);
    }
    protected  void dispose(){
        System.out.println("disposeing Characiteristic  "+s);
    }

}

class Description{
    private String s;
    Description(String s){
        this.s =s;
        System.out.println("creating Description "+s);
    }
    protected void dispose(){
        System.out.println("disposing Description "+s);
    }

}

class LivingCreature{
    private Characteristic characteristic = new Characteristic("is alive");
    private Description description = new Description("Basic Living Creature");
    LivingCreature(){
        System.out.println("Living Creating");
    }

    protected  void dispose(){
        System.out.println("Living dispose");
        characteristic.dispose();;
        description.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic characteristic = new Characteristic("has heart");
    private Description description = new Description("Animal not Vegetable");
    Animal(){
        System.out.println("Animal dispose");
    }
    protected void dispose(){
        System.out.println("Animal dispose");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic characteristic = new Characteristic("can live in water");
    private Description description = new Description("Both water and land");
    Amphibian(){
        System.out.println("Amphibian");
    }
    protected  void dispose(){
        System.out.println("Amphibian dispose");
        description.dispose();
        characteristic.dispose();
    }
}
