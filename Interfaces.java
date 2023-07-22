interface ChessPlayer {
    void moves ();
}
class Queen implements ChessPlayer {
    public void moves () {
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
    }
}
class Rook implements ChessPlayer {
    public void moves () {
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer {
    public void moves () {
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}
// multiple inheritance
interface Herbivore {
    void vegFood();
}
interface Carnivore {
    void nonvegFood();
}
class Bear implements Herbivore, Carnivore {
    public void vegFood () {
        System.out.println("Eats grass");
    }
    public void nonvegFood () {
        System.out.println("Eats meat");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        Rook r = new Rook();
        King k = new King();
        q.moves();
        r.moves();
        k.moves();

        Bear b = new Bear();
        b.vegFood();
        b.nonvegFood();
    }
}
