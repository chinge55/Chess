public class Knight extends Pieces
{
    private int player;
    private int x,y;
    private int next_x, next_y;
    private boolean check = false;

    public Knight(int player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y)
    {
        this.next_x = x;
        this.next_y = y;
        knightsmove();

    }

    private void knightsmove()
    {
        if((x-next_x==Math.abs(2)) && (y-next_y==Math.abs(3)))
            check = true;
        else if((x-next_x==Math.abs(3)) && (y-next_y==Math.abs(2)))
            check = true;
    }

    @Override
    public String getName() {
        String str;
        str = " Knight ";
        if(player ==1)
            str = str.toUpperCase();
        return str;
    }

    @Override
    public boolean validate_move()
    {
        return check;
    }

    public int getPlayer()
    {
        return player;
    }
}
