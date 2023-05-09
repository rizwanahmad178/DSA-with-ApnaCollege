package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal (In all Direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal (One step in each)");
    }
}
