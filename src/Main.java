// When calling the king, pawn and the knight, there will be no loop
// when calling the other pieces, create an infinite loop and end if the coordinates match or if the loop is broken by an
// error..
//

public class Main
{
    public static Pieces[][] pieces = new Pieces[8][8];
    public static void main(String[] args)
    {
        putthings();
        // Specify which piece you want to move and where
        showboard();
        pieces[6][2].move(5,2);
        if(pieces[6][2].validate_move()==true)
        {
            // now I need to check for any conflict before this code
            if(checkconflict(6,2,5,2)==true)
            {
                pieces[5][2]=pieces[6][2];
                pieces[6][2]=null;
                showboard();
            }
        }

    }
    static private void putthings()
    {
        pieces[0][0] = new Rook(1,0,0);
        pieces[0][1] = new Knight(1,0,1);
        pieces[0][2] = new Bishop(1,0,2);
        pieces[0][3] = new King(1,0,3);
        pieces[0][4] = new Queen(1,0,4);
        pieces[0][5] = new Bishop(1,0,5);
        pieces[0][6] = new Knight(1,0,6);
        pieces[0][7] = new Rook(1,0,7);
        for(int i=0; i<8; i++)
        {
            pieces[1][i] = new Pawn(1,1,i);
        }

        pieces[7][0] = new Rook(2,7,0);
        pieces[7][1] = new Knight(2,7,1);
        pieces[7][2] = new Bishop(2,7,2);
        pieces[7][3] = new King(2,7,3);
        pieces[7][4] = new Queen(2,7,4);
        pieces[7][5] = new Bishop(2,7,5);
        pieces[7][6] = new Knight(2,7,6);
        pieces[7][7] = new Rook(2,7,7);
        for(int i=0; i<8; i++)
        {
            pieces[6][i] = new Pawn(2,6,i);
        }

    }
    static private void showboard()
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                if(pieces[i][j]==null)
                {
                    System.out.print("  ----  ");
                }
                else
                {
                    System.out.print(pieces[i][j].getName());
                }
            }
            System.out.println("");
        }
    }
    static private boolean checkconflict(int x, int y, int next_x, int next_y)
    {
        if(pieces[next_x][next_y]!=null)
        {
            if(pieces[x][y].getPlayer()==pieces[x][y].getPlayer())
            {
                System.out.println("What are you doing?");
                return false;
            }
            else
                return true;
        }
        return true;
    }
}
