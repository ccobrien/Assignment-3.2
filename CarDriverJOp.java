import javax.swing.JOptionPane;


public class CarDriverJOp 
{
	public static void main(String [] args){
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();

		//create car 1
		for(int increment = 0; increment <3; increment++)
		{
			//prompt for user input on car
			String color = JOptionPane.showInputDialog(null, "Please enter the car's color.");
			String horsePower = JOptionPane.showInputDialog(null, "Please enter the car's horse power.");
			int horsePwr = Integer.parseInt(horsePower);
			String engineSize = JOptionPane.showInputDialog(null, "Please enter the car's engine size.");
			int engine = Integer.parseInt(engineSize);
			String make = JOptionPane.showInputDialog(null, "Please enter the car's make");
		
			//create car1
			if(increment == 0){
				car1.setColor(color);
				car1.setHorsePwr(horsePwr);
				car1.setEngine(engine);
				car1.setMake(make);
			}
			//create car2
			if(increment == 1){
				car2.setColor(color);
				car2.setHorsePwr(horsePwr);
				car2.setEngine(engine);
				car2.setMake(make);
			}
			//create car3
			if(increment == 2){
				car3.setColor(color);
				car3.setHorsePwr(horsePwr);
				car3.setEngine(engine);
				car3.setMake(make);
				
				//create car 4
				car4.setColor(color);
				car4.setHorsePwr(horsePwr);
				car4.setEngine(engine);
				car4.setMake(make);
			}
		}
		
		
		
		//Output cars and count
		JOptionPane.showMessageDialog(null, "Car one: " + car1);
		JOptionPane.showMessageDialog(null, "Car two: " + car2);
		JOptionPane.showMessageDialog(null, "Car three: " + car3);
		JOptionPane.showMessageDialog(null, "Car four: " + car4);
		JOptionPane.showMessageDialog(null, "Car count is " + Car.getCount());
		
		//compare car 3 and car 4
		if(car3.equals(car4))
		{
		JOptionPane.showMessageDialog(null, "Car three and car four are equal.");
		}
	}
}
