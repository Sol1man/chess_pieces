import static java.lang.Math.abs;
import javafx.scene.layout.GridPane;

public class Pawn extends Piece
{
    public Pawn(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Pawn");

        if (color.equals("White"))
        {
            setImageView("assets/w_pawn_png_128px.png");
        }
        else
        {
            setImageView("assets/b_pawn_png_128px.png");
        }
    }

    @Override
    public void setMovablePoints(Board board)
    {
        for(int i = 0 ; i < 8 ; i++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                if(this.getColor().equals("White") & board.getTile(i, j).getX() - this.getX() == -1 & board.getTile(i, j).getY() == this.getY()
                        | this.getColor().equals("Black") & board.getTile(i, j).getX() - this.getX() == 1 & board.getTile(i, j).getY() == this.getY())
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
