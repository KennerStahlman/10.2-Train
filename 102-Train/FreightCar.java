import java.awt.*;
public class FreightCar extends RailCar{

    
    public FreightCar(int x, int y, int idx, Color color){
        super(150, x, idx, color, y);
    }
    
    @Override
    public void drawCar(Graphics g){

        super.drawCar(g);

        g.setColor(Color.BLACK);
        g.drawRect(x+35, y+10, 50, 40);
        g.drawRect(x+85, y+10, 50, 40);
        g.fillRect(x+75, y+25, 5, 10);
        g.fillRect(x+95, y+25, 5, 10);
    }
}

