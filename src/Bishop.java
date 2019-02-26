public class Bishop extends Pieces implements MoveDiagonal, Player
{
    private int player;

    @Override
    public int player() {
        return 0;
    }

    public Bishop(int player) {
        this.player = player;
    }

    @Override
    public void move()
    {

    }

}
