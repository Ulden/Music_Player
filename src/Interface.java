import javax.swing.*;
import java.awt.*;

/**
 * Created by ulden on 15-5-20.
 */
public class Interface extends JFrame{
    public static void main(String [] args){
        JFrame f=new JFrame("Gioro's Music Player");
        f.getContentPane();
        f.setSize(400,100);
        f.setVisible(true);

        JButton playButton=new JButton("Play");
        JButton pauseButton=new JButton("Pause");
        JButton loopButton=new JButton("Loop");

        JPanel p=new JPanel();
        p.setLayout(new GridLayout(1,3));
        p.setBorder(BorderFactory.createTitledBorder("Created By Gioro Ulden"));

        p.add(playButton);
        p.add(pauseButton);
        p.add(loopButton);

    }
}
