import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Display extends JPanel{
	public Display(){}
	// paintCommponent is not explicitly called. It is executed whenever the JPanel is called.
	// Graphics g object is implicitly passed to function.
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		setBackground(Color.WHITE);
		Train train = new Train(100,300); 
		train.addCar("Locomotive",Color.blue); 
		train.addCar("PassengerCar",Color.gray); 
		train.addCar("PassengerCar",Color.gray); 
		train.addCar("FreightCar",Color.green); 
		train.addCar(3,"PassengerCar",Color.gray); 
		train.addCar("FreightCar",Color.green); 
		train.addCar("Caboose",Color.red); 
		train.addCar(6,"FreightCar",Color.green); 
		train.showCars(g); 
	}
}
