package Game;



import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    public GameBoard() {
        this.setSize(660, 660);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 64; row++) {
            for (int col = 0; col < 64; col++) {
                GameTile tile = new GameTile(row, col);
                tile.boardGrid(g);
                tile.render(g);
                tile.PixelsAboutToBurn(g);
            }
        }
    }
}