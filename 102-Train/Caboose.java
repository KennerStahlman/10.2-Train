import java.awt.*;
public class Caboose extends RailCar{
    public Caboose(int x, int y, int idx, Color color){
        super(150, x, idx, color, y);
    }
    
    @Override
    public void drawCar(Graphics g){

        super.drawCar(g);
        g.fillRect(x+40, y-30, 100, 5);
        g.setColor(Color.RED);
        g.fillRect(x+45, y-25, 90, 25);

        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y + 30, 25, 25);
        g.fillRect(x + 100, y + 30, 25, 25);
    
    }
}
