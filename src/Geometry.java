import java.awt.*;
import javax.swing.*;


// begining of the Gepmetry class
// geometry class uses JFrame to draw the window and 
// geometric shapes  
public class Geometry  extends JFrame {

//Variables to use for drawing 3 shapes.

//variable for circle
public double cir_x = 0;
public double cir_y = 0;
public double cir_width = 0;
public double cir_height = 0;
public Color cir_color = null;

//variables for square1
public double square_x1 = 0;
public double square_y1 = 0;
public double square_width1 = 0;
public double square_height1 = 0;
public Color square_color1 = null;

//variables for square2
public double square_x2 = 0;
public double square_y2 = 0;
public double square_width2 = 0;
public double square_height2 = 0;
public Color square_color2 = null;

// constructor function
// this function is executed once we define a variable of
// type class geometry in main.
// this function creates the canvas with size of 500 by 500.
// you can change the size if its needed
public Geometry() {

    setSize(new Dimension(500, 500));
    // program will be finished by closing the window 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // make the window visible
    setVisible(true);
}

// This function draws the shapes on the window
// and get called automatically ( no need to call it saparely)
// this function uses the variables that are defined above. The value of the
// variables are set in main file.
public void paint(Graphics g) {

        // draws the rectangle without color 
	if(square_color1 == null)
	{
	    g.drawRect((int)square_x1, (int)square_y1, (int)square_width1, (int)square_height1);
		
	}
	else
	{
           // draws rectangle with color 
		g.setColor(square_color1);
	    g.fillRect((int)square_x1, (int)square_y1, (int)square_width1, (int)square_height1);
	}
	

	if (cir_color == null)
	{
		g.drawOval((int)cir_x, (int)cir_y, (int)cir_width, (int)cir_height);
	}
	else
	{
		g.setColor(cir_color);
		g.fillOval((int)cir_x, (int)cir_y, (int)cir_width, (int)cir_height);
	}


      
	if (square_color2 == null)
	{
		    g.drawRect((int)square_x2, (int)square_y2, (int)square_width2, (int)square_height2);
	}
	else
	{
		   g.setColor(square_color2);
		   g.fillRect((int)square_x2, (int)square_y2, (int)square_width2, (int)square_height2);

	}
 }

public static void main(String arg[])
{	 
      // defining variable filledObjects as type of Geometry
      Geometry filledObjects =   new Geometry();
      
      // set the coordinates and width and heights 
      // of the shapes
      filledObjects.square_x1 = 175;
      filledObjects.square_y1 = 175;
      filledObjects.square_width1 = 150;
      filledObjects.square_height1 = 150;
      filledObjects.square_color1 = Color.yellow;
      
      filledObjects.cir_width = 150;
      filledObjects.cir_height = 150;
      filledObjects.cir_x = 175;
      filledObjects.cir_y = 175;
      filledObjects.cir_color = Color.blue;
      
      filledObjects.square_x2 = 175 + 22;
      filledObjects.square_y2 = 175 + 22;
      filledObjects.square_width2 = 106;
      filledObjects.square_height2 = 106;
      filledObjects.square_color2 = Color.red;
      


     /* 
      Geometry emptyObjects =   new Geometry();
      emptyObjects.cir_width = 150;
      emptyObjects.cir_height = 150;
      emptyObjects.cir_x = 30;
      emptyObjects.cir_y = 30;
      emptyObjects.cir_color = null;
      
      emptyObjects.square_x1 = 30;
      emptyObjects.square_y1 = 30;
      emptyObjects.square_width1 = 100;
      emptyObjects.square_height1 = 100;
      emptyObjects.square_color1 = null;
      */
     
   
}

}
