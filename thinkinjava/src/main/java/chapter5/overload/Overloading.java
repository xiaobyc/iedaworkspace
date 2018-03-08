package chapter5.overload;

/**
 * Created by xiaobyc on 2017/2/6.
 */
class Tree {
    int height;
    Tree(){
        System.out.println("Planting a seeding");
        height=0;
    }
    Tree(int initHeight){
        height =initHeight;
        System.out.println("creating new Tree that is "+height+" feet tall");
    }
    void  info(){
        System.out.println("Tree is "+height+"feet tall");
    }
    void   info( String s ){
        System.out.println(s +"：tree is "+height+" feel tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Tree  tree = new Tree(i);
            tree.info();
            tree.info("overloaded method");
        }
        new Tree();
    }
}
