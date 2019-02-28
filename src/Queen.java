public class Queen extends Pieces implements MoveStraight, MoveDiagonal
{
    private int player;
    private int x,y;
    private int next_x, next_y;
    private boolean check = false;

    public Queen(int player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }


    // this function overridden from pieces has to be used to check for the checkmates, kills, respawns etc...
    // everything has to be called from move
    @Override
    public void move(int x, int y)
    {
        // Hello, I am the Queen, Important thing :D
        // call this move at initialization and get the current coordinates, and then call it again to get the
        // next coordinates...
        // to check the move, make another function
        this.next_x = x;
        this.next_y = y;
        move_straight();
        move_diagonal();
    }
    @Override
    public String getName() {
        String str;
        str = " Queen  ";
        if(player ==1)
            str = str.toUpperCase();
        return str;
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
    public void move_diagonal()
    {
        if(((x-next_x)==Math.abs(1)) && ((y-next_y)==Math.abs(1)))
        {
            this.check = true;
        }


    }

    // the validate move has to be called everytime
    // i.e if you have to move from 2,0 to 2,5 then it should be called for 2,1.. 2,2.. & all
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
