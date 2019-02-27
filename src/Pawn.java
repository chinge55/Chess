public class Pawn extends Pieces implements MoveStraight, MoveDiagonal
{
    private int player;

    @Override
    public int player() {
        return 0;
    }

    public Pawn(int player) {
        this.player = player;
    }

    @Override
    public void move(int x, int y)
    {

    }
}
