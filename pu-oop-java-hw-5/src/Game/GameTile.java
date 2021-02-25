package Game;

import javax.swing.*;
import java.awt.*;

public class GameTile extends JFrame {

    private int row;
    private int col;

    public GameTile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g){
        for (int x = 0; x<640;x++){
            for (int y = 0; y<640;y++){

                boardGrid(g);
                PixelsAboutToBurn(g);
            }
        }
    }

    void boardGrid(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i <= 640; i += 10) {
            for (int j = 20; j <= 640; j += 10) {
                g.drawRect(i, j, 100, 100);
            }
        }
    }

    void PixelsAboutToBurn(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(10,30,10,10);
    }
}
