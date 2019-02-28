public class Rook extends Pieces implements MoveStraight
{
    private int player;
    private int x,y;
    private int next_x, next_y;
    private boolean check = false;

    public Rook(int player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move_straight()
    {
        if(((x-next_x)==Math.abs(1)) && ((y-next_y)==0))
        {
            this.check = true;
        }
        else if(((y-next_y)==Math.abs(1)) && ((x-next_x)==0))
        {
            this.check = true;
        }
        else
        {
            this.check = false;
        }
    }
    @Override
    public String getName() {
        String str;
        str = "  Rook  ";
        if(player ==1)
            str = str.toUpperCase();
        return str;
    }

    @Override
    public boolean validate_move()
    {
        if(check == true)
        {
            x = next_x;
            y = next_y;
        }
        return check;
    }

    public int getPlayer() {
        return player;
    }
}
