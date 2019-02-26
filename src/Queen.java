public class Queen extends Pieces implements MoveStraight, MoveDiagonal, Player
{
    private int player;

    @Override
    public int player() {
        return 0;
    }

    public Queen(int player) {
        this.player = player;
    }

    @Override
    public void move()
    {

    }

    @Override
    public void move_horizontal() {

    }

    @Override
    public void move_vertical() {

    }
}
