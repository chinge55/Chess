public class Main
{
    private static Pieces[][] pieces = new Pieces[8][8];
    public static void main(String[] args)
    {
        putthings();
    }
    static private void putthings()
    {
        pieces[0][0] = new Rook(1);
        pieces[0][1] = new Knight(1);
        pieces[0][2] = new Bishop(1);
        pieces[0][3] = new King(1);
        pieces[0][4] = new Queen(1);
        pieces[0][5] = new Bishop(1);
        pieces[0][6] = new Knight(1);
        pieces[0][7] = new Rook(1);
        for(int i=0; i<8; i++)
        {
            pieces[1][i] = new Pawn(1);
        }

        pieces[7][0] = new Rook(2);
        pieces[7][1] = new Knight(2);
        pieces[7][2] = new Bishop(2);
        pieces[7][3] = new King(2);
        pieces[7][4] = new Queen(2);
        pieces[7][5] = new Bishop(2);
        pieces[7][6] = new Knight(2);
        pieces[7][7] = new Rook(2);
        for(int i=0; i<8; i++)
        {
            pieces[6][i] = new Pawn(2);
        }

    }
}
