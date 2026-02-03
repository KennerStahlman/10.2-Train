import javax.swing.*;
import java.awt.*;              

public class RailCar{
    protected int width;
    protected int x;
    protected int baseX; 
    protected Color color;
    protected int y;
    
    public RailCar(int width, int baseX, int index, Color color, int y){
        this.width = width;
        this.baseX = baseX;
        this.x = baseX + width * index;
        this.color = color;
        this.y = y;
    }
    

    public void updatePosition(int index){
        this.x = baseX + width * index;
    }

    public void drawCar(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x,y+50,25,10);
        g.setColor(color);
        g.fillRect(x+25, y, width-25, 80);
        
        g.setColor(Color.BLACK);
        int wheelY = y + 65;
        int wheelSize = 30;
        int wheelSpacing = width / 3 + 10;
        
        for(int i = 0; i < 2; i++){
            int wheelX = x + (i * wheelSpacing) + 40;
            g.fillOval(wheelX, wheelY, wheelSize, wheelSize);
        }
    }
}
