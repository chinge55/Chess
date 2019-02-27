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
    }
    static private void putthings()
    {
        pieces[0][0] = new Rook(1,0,0);
        pieces[0][1] = new Knight(1);
        pieces[0][2] = new Bishop(1);
        pieces[0][3] = new King(1,0,3);
        pieces[0][4] = new Queen(1);
        pieces[0][5] = new Bishop(1);
        pieces[0][6] = new Knight(1);
        pieces[0][7] = new Rook(1),0,7;
        for(int i=0; i<8; i++)
        {
            pieces[1][i] = new Pawn(1);
        }

        pieces[7][0] = new Rook(2,7,0);
        pieces[7][1] = new Knight(2);
        pieces[7][2] = new Bishop(2);
        pieces[7][3] = new King(2,7,3);
        pieces[7][4] = new Queen(2);
        pieces[7][5] = new Bishop(2);
        pieces[7][6] = new Knight(2);
        pieces[7][7] = new Rook(2,7,7);
        for(int i=0; i<8; i++)
        {
            pieces[6][i] = new Pawn(2);
        }

    }
}
