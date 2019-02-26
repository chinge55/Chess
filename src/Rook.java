public class Rook extends Pieces implements MoveStraight, Player
{
    private int player;

    @Override
    public int player() {
        return 0;
    }

    public Rook(int player) {
        this.player = player;
    }

    @Override
    public void move() {

    }

    @Override
    public void move_horizontal() {

    }

    @Override
    public void move_vertical() {

    }
}
