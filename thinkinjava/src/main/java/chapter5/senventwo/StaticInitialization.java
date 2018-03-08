package chapter5.senventwo;

import javafx.scene.control.Tab;

/**
 * Created by xiaobyc on 2018/1/28.
 */
class Bow1{
    Bow1(int marker){
        System.out.println("Bow1 ("+marker+")");
    }
    void f1(int marker){
        System.out.println("f1("+marker+")");
    }
}
class  Table{
    static Bow1 bow1 = new Bow1(1);
    Table(){
        System.out.println("Table()");
        bow2.f1(1);
    }
    void  f2(int marker){
        System.out.println("f2("+marker+")");
    }
    static  Bow1 bow2 = new Bow1(2);
}

class  Cupboard{
    Bow1 bow3 = new Bow1(3);
    static  Bow1 bow4 = new Bow1(4);
    Cupboard(){
        System.out.println("Cupboard.....");
        bow4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }
    static  Bow1 bow15 = new Bow1(5);
}
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static  Table  table = new Table();
    static Cupboard cupboard = new Cupboard();
}
