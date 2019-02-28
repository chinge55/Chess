public class Pawn extends Pieces implements MoveStraight, MoveDiagonal
{
    private int player;
    private int x,y;
    private int next_x, next_y;
    private boolean check = false;

    public Pawn(int player, int x, int y)
    {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        String str;
        str = "  Pawn  ";
        if(player ==1)
            str = str.toUpperCase();
        return str;

    }

    @Override
    public void move_diagonal()
    {
        // this has to be called only if there is conflict and not on anything else

    }

    @Override
    public void move_straight()
    {
        if(player == 1 && next_x -x ==1)
        {
            check = true;
        }
        else if(player ==2 && x-next_x ==1)
        {
            check =true;
        }
    }

    @Override
    public void move(int x, int y)
    {
        this.next_x = x;
        this.next_y = y;

    }

    @Override
    public boolean validate_move() {
        return check;
    }
}
