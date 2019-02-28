public class Bishop extends Pieces implements MoveDiagonal
{
    private int player;
    private int x,y;
    private int next_x, next_y;
    private boolean check = false;

    public Bishop(int player, int x, int y) {
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
    public void move_diagonal()
    {
        if(((x-next_x)==Math.abs(1)) && ((y-next_y)==Math.abs(1)))
        {
            this.check = true;
        }
    }
    @Override
    public String getName() {
        String str;
        str = " Bishop ";
        if(player ==1)
            str = str.toUpperCase();
        return str;
    }

    @Override
    public boolean validate_move()
    {
        return check;
    }

    public int getPlayer() {
        return player;
    }

}
