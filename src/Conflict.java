public class Conflict
{
    int [][] data;
    int x,y;
    public Conflict(int[][] data,int x,int y)
    {
        this.data = data;
        this.x = x;
        this.y = y;
    }
    private void checkconflict()
    {
        if(data[x][y]!=null)
        {

        }

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
