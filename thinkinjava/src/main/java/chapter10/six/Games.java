package chapter10.six;

/**
 * Created by xiaobyc on 2017/3/5.
 */
interface Game{
    boolean move();
}
interface GameFactory{
    Game getGame();
}
class Checkers implements Game{
    private Checkers(){}
    private int moves =0;
    private static final int MOVES=3;
    public boolean move() {
        System.out.println("checkers move "+moves);
        return ++moves!=MOVES;
    }
    public static GameFactory  factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}
class Chess implements Game{
    private Chess(){};
    private int moves =0;
    private static  final int MOVES=4;
    public boolean move() {
        System.out.println("Chess move "+moves);
        return ++moves!=MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Chess();
        }
    };
}
public class Games {
    public  static void playGame(GameFactory factory){
        Game game =factory.getGame();
        while(game.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
