public class King extends Pieces implements Player
{
    private int player;
    private int x,y;

    public King(int player) {
        this.player = player;
    }

    // this function overridden from pieces has to be used to check for the checkmates, kills, respawns etc...
    @Override
    public void move()
    {

    }



    @Override
    public int player() {
        return player;
    }
}
