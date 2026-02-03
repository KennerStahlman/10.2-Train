import java.awt.*;

public class Locomotive extends RailCar {
    
    public Locomotive(int x, int y, int idx, Color color){
        super(150, x, idx, color, y);
    }
    
    @Override
    public void drawCar(Graphics g){
        int[] xPoints = {
            x,                          // 0
            x+width,                 // 1
            x+width,                 // 2
            x+width/2,                  // 3
            x+width/2,                  // 4
            (int)(x+width/1.75),       // 5
            x+width/3,                  // 6
            (int)(x+width/2.5),         // 7
            (int)(x+width/2.5),         // 8
            (int)(x+width/2.5),         // 9
            x+width/4,                  // 10
            x+width/4,                  // 11
            x                           // 12
        };
        int[] yPoints = {
            y+80,                       // 0
            y+80,                       // 1
            y,                       // 2
            y,                       // 3
            y-5,                          // 4
            y-15,                       // 5
            y-15,                       // 6
            y-5,                          // 7
            y,                       // 8
            y,                       // 9
            y,                       // 10
            y+50,                       // 11
            y+80                        // 12
        };
        
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 13);
        
        drawWheels(g);
    }
}
