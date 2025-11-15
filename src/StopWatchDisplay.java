/*
  This Class will Create the Frame needed to display the Window
  and all the basic variables like its size.
 */
//Necessary Imports to create a Window
import javax.swing.*;
import java.awt.*;

public class StopWatchDisplay {
    //A top level window variable with the name mainWindow;
    JFrame mainWindow = new JFrame("Stopwatch");;

    Container mainPane = mainWindow.getContentPane();


    //Buttons needed to perform actions on
    private final JButton start = new JButton("Start");
    private final JButton stop = new JButton("Stop");
    private JLabel timeDisplay = new JLabel("00:00:00");

    //Display Attributes
    public void display(){
        //Creates a new Frame method, sets the window size, Centers, and Makes Visible

        //How big the window is
        mainWindow.setSize(400,400);

        //Centers Window in middle of the screen
        mainWindow.setLocationRelativeTo(null);

        //Application and Window fully terminate on Closure
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Can not resize window
        mainWindow.setResizable(false);

        //Makes the application Visible
        mainWindow.setVisible(true);
    }

    public void StopwatchTimer(){
        //Whole Window will use BorderLayout
        mainPane.setLayout(new BorderLayout());

        //Panel in Center of Window
        JPanel timer = new JPanel(new GridBagLayout());

        //add JLabel to timer Panel
        timer.add(timeDisplay);

        //timer panel in Center Pane
        mainPane.add(timer,BorderLayout.CENTER);

        //Text was not appearing in Regular Canvas Size, Had to Full screen to see, then minimize for desired output.
        mainPane.validate();
        mainPane.repaint();
    }



    public void StopwatchButtons(){
        mainPane.add(start);
        mainPane.add(stop);
    }

    //Constructor class that calls the display
    StopWatchDisplay(){
        display();
        StopwatchTimer();
    }







}
