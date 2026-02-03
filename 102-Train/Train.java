import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    private ArrayList<RailCar> railCars;
    private int x;
    private int y;

    public Train(int x, int y){
        this.railCars = new ArrayList<>();
        this.x = x;
        this.y = y;
    }
    
    public void addCar(String type, Color color){
        addCar(this.railCars.size(), type, color);
    }
    
    public void addCar(int index, String type, Color color){
        RailCar newCar = null;
        if(type.equals("Locomotive")){
            newCar = new Locomotive(x, y, index, color);
        }
        else if(type.equals("PassengerCar")){
            newCar = new PassengerCar(x, y, index, color);
        } 
        else if(type.equals("FreightCar")){
            newCar = new FreightCar(x, y, index, color);
        } 
        else if(type.equals("Caboose")){
            newCar = new Caboose(x, y, index, color);
        }
        
        if(newCar != null){
            this.railCars.add(index, newCar);
            updateCarPositions(index + 1);
        }
    }
    
    private void updateCarPositions(int startIndex){
        for(int i = startIndex; i < this.railCars.size(); i++){
            this.railCars.get(i).updatePosition(i);
        }
    }

    public void showCars(Graphics g){
        for(RailCar railCar : this.railCars){
            railCar.drawCar(g);
        }
    }
}