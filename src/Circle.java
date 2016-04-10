//The imports that are used
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 *  @author Dion de Jong 
 *  @version 1.0 (09-10-13)  			            	
 *  This program is asks the user for the diameter of a circle and manipulates the value in many ways.
 *  It will then draw the circle. After the circle is drawn, it draws the largest square that can possible fit 
 *  inside the circle within it. It then also draws the smallest square that the circle can fit inside of and puts 
 *  the circle inside of that. 
 */

//This section initializes the variables that will be used to draw the objects
class Circle extends JFrame {
	//Variables used for the circle
	static int CircleX = 0; 
	static int CircleY = 0; 
	static int CircleDiameter = 0; 

	//Variables used for the square that goes inside the circle 
	static int InsideSquareX = 0;
	static int InsideSquareY = 0;
	static int InsideSquareSide = 0;

	//Variables used for the square that goes outside the circle 
	static int OutsideSquareX = 0;
	static int OutsideSquareY = 0;
	static int OutsideSquareSide = 0;

	//static boolean that hopefully creates two Jframe windows by running both as false and true
	static boolean drawFilled = false;
	
	

	//this is the constructor 
	public Circle(int x, int y, boolean on )
	{
		//Create Title for the JFrame
		super ("CircleSquare");

		//Sets the default close Operation 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		//Set the Size of the JFrame
		setSize(x, y); 

		//Allow the JFrame to show on the screen
		setVisible(true); 

		//Rename the boolean to the one used in the constructor
		drawFilled = on; 
	}


	//This will draw the Circle and the two squares once the values are determined.  
	public void paint (Graphics g)
	{
		super.paint(g);
		//The if statement that is used so that both an outline and a filled in version of the drawing show in two separate windows based on the condition that one is drawn with a false boolean and the other with a true boolean
		if (drawFilled == true)
		{
			//Make the next shape red
			g.setColor(Color.RED);
			//draw the filled square inside the circle
			g.fillRect(OutsideSquareX, OutsideSquareY, CircleDiameter, CircleDiameter);

			//set the color the circle is filled with
			g.setColor(Color.ORANGE);
			//draw the filled circle
			g.fillOval(CircleX, CircleY, CircleDiameter, CircleDiameter);

			//set the color the square inside the circle is filled with
			g.setColor(Color.GREEN);
			//draw the filled in square inside the circle
			g.fillRect(InsideSquareX, InsideSquareY, InsideSquareSide, InsideSquareSide);
			
			
		}
		else
		{
			//draw the outline for the square inside the circle
			g.drawRect(OutsideSquareX, OutsideSquareY, CircleDiameter, CircleDiameter);
			
			//draw the circle outline
			g.drawOval(CircleX, CircleY, CircleDiameter, CircleDiameter);

			//draw the outline for the square inside the circle
			g.drawRect(InsideSquareX, InsideSquareY, InsideSquareSide, InsideSquareSide);
			

		}



	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Opening dialog/title
		JOptionPane.showMessageDialog(null, "Welcome to the circle project.");

		//receive diameter input from user as a string and convert to a double. 
		String diameterString = JOptionPane.showInputDialog(null, "Please enter the Diameter of your circle");
		CircleDiameter = Integer.parseInt(diameterString);
		JOptionPane.showMessageDialog(null, "The Diameter you entered is: " + CircleDiameter);


		//calculate some other values the program is required to print, such as radius, area, and circumference.
		double radius = CircleDiameter/2; 
		double area = Math.PI*(radius*radius);
		double circumference = Math.PI*CircleDiameter;

		//display these values to the user
		JOptionPane.showMessageDialog(null, "The radius, as a result is " + radius);
		JOptionPane.showMessageDialog(null, "The area of this circle is " + area);
		JOptionPane.showMessageDialog(null, "The circumference of your circle is " + circumference); 


		/*The smallest square that can hold a circle of a certain size must have sides that are 
		 * at least the length of the diameter. This means the area of the smallest square is the diameter squared.
		 */
		double bigsquarearea = CircleDiameter * CircleDiameter; 

		//display this calculation to the user
		JOptionPane.showMessageDialog(null, "The area of the smallest square that can hold your circle is " + bigsquarearea); 

		//to calculate the area of the square inside the circle, we must use trigonometry and the pythagorean theorem. 
		double halfdiameter = (CircleDiameter*CircleDiameter)/2; 
		InsideSquareSide = (int) Math.sqrt(halfdiameter);
		double smallsquarearea = InsideSquareSide*InsideSquareSide; 

		//display the calculated value
		JOptionPane.showMessageDialog(null, "The area of the largest square that can fit inside your circle is " + smallsquarearea); 

		//calculate the x and y values for the square that is place inside the circle so that it is placed correctly.
		InsideSquareX = (CircleDiameter - InsideSquareSide)/2;  //x and y for inside square
		InsideSquareY = (CircleDiameter - InsideSquareSide)/2;  //x and y for inside square\

		/*
		 * pull from all of the above code to actually create the shapes. Right now it successfully draws the filled in image 
		 * after the example given in the homework sheet. 
		 */
		Circle first = new Circle(CircleDiameter + 150, CircleDiameter + 150, true); 
		//uncomment the line below and comment the line above to view the unfilled shape.  
		//Circle second = new Circle(CircleDiameter + 150, CircleDiameter + 150, false); 

	}
}
