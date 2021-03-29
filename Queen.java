
import static java.lang.Math.abs;

public class Queen extends Piece
{
    public Queen(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Queen");

        if (color.equals("White"))
        {
            setImageView("assets/w_queen_png_128px.png");
        }
        else
        {
            setImageView("assets/b_queen_png_128px.png");
        }
    }

    @Override
    public void setMovablePoints(Board board)
    {
        for(int i = 0 ; i < 8 ; i++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                if(abs(board.getTile(i, j).getX() - this.getX()) == abs(board.getTile(i,j).getY() - this.getY())
                        | abs(board.getTile(i, j).getX()) == this.getX() | (abs(board.getTile(i,j).getY())==  this.getY()))
                {
                    if(board.getTile(i, j).getPiece()==null){
                        board.getTile(i, j).toggle();
                        board.getTile(i, j).setMovablePiece(this);
                    }

                }
            }
        }
    }
}
