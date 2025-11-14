
//Necessary Imports to create a Window
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class StopWatchDisplay {
    /*
      This Class will Create the Frame needed to display the Window
      and all the basic variables like its size.
     */

    //A top level window variable with the name mainWindow;
    JFrame mainWindow;

    //Display Attributes
    public void display(){

        //Creates a new Frame method and assigns the frame title
        mainWindow = new JFrame("Stopwatch");
        //How big the window is
        mainWindow.setSize(400,400);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Makes the application Visible
        mainWindow.setVisible(true);


    }

    //Constructor class that calls the display
    StopWatchDisplay(){
        display();
    }







}
