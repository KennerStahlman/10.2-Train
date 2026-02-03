import java.awt.*;

public class PassengerCar extends RailCar{
    
    public PassengerCar(int x, int y, int idx, Color color){
        super(150, x, idx, color, y);
    }
    
    @Override
    public void drawCar(Graphics g){

        super.drawCar(g);

        g.setColor(Color.WHITE);
        g.fillRect(x + 50, y + 10, 25, 40);  // Window example
        g.fillRect(x + 100, y + 10, 25, 40);  // Window example
    }
}
