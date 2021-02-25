package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
                PixelAboutToBurn(g);
                BurnedPixel(g);
                GoodPixel(g);
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

    private int RandomPixels() {
        Random random = new Random();
        int rand = random.nextInt(8);
        while (rand == 2) {
            rand = random.nextInt(8);
        }
        return rand;
    }

    public void PixelAboutToBurn(Graphics g){

        int p1 = RandomPixels();

        g.setColor(Color.BLUE);
        g.fillRect((p1*50)+10,30,10,10);
        g.fillRect((p1*500)+20,40,10,10);
        g.fillRect((p1*10)+30,60,10,10);
    }

    public void BurnedPixel(Graphics g){

        int p2 = RandomPixels();

        g.setColor(Color.RED);
        g.fillRect((p2*50)+10,30,10,10);
        g.fillRect((p2*80)+10,40,10,10);
        g.fillRect((p2*50)+10,80,10,10);
    }

    void GoodPixel(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, 10, 10);
    }
}
