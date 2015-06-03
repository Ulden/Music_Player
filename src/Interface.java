
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * this is the user interface, Operations are in the OperateFunctions.java
 *
 * Created by ulden on 15-5-20.
 */

public class Interface extends JFrame {
    //Construct


    public Interface(){
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //Initialize the window
    private void init(){
        //Main window Frames Init

        JPanel playControl=new JPanel();//put the control buttons here
        JPanel playListPane=new JPanel();//put the playList here
        add(playControl);
        add(playListPane);
        JSplitPane pane=new JSplitPane(JSplitPane.VERTICAL_SPLIT,playControl,playListPane);
        add(pane);

        //Play Control Buttons init
        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton loopButton = new JButton("Loop");
        JButton nextButton = new JButton("Next Song");
        JButton preButton = new JButton("Previous Song");
        JButton forwardButton = new JButton("Forward");
        JButton backwardButton = new JButton("Backward");

        playControl.add(playButton);
        playControl.add(pauseButton);
        playControl.add(loopButton);
        playControl.add(nextButton);
        playControl.add(preButton);
        playControl.add(forwardButton);
        playControl.add(backwardButton);

        //show playlist



        //add Actions to the Play Control Buttons
        ActionListener listener=new ControlActionListener();

        playButton.addActionListener(listener);
        pauseButton.addActionListener(listener);
        loopButton.addActionListener(listener);
        nextButton.addActionListener(listener);
        preButton.addActionListener(listener);
        forwardButton.addActionListener(listener);
        backwardButton.addActionListener(listener);
    }


    //The "main" function
    public static void main(String [] args) {
        Interface mainWindow=new Interface();
        mainWindow.setBounds(100,100,310,260);
        mainWindow.setTitle("Gioro's Music Player");
    }

}
