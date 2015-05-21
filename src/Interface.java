import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this is the user interface, Operations are in the OperateFunctions.java
 *
 * Created by ulden on 15-5-20.
 */
public class Interface extends JFrame {
    static private OperateFunctions opa;//=new OperateFunctions();


    //Construct
    public Interface(){
        opa = new OperateFunctions();
    }
    //Entrance
    public static void main(String [] args){
        JFrame f=new JFrame("Gioro's Music Player");
        f.getContentPane();
        f.setSize(600,100);
        f.setVisible(true);
        //Buttons
        JButton playButton=new JButton("Play");
        JButton pauseButton=new JButton("Pause");
        JButton loopButton=new JButton("Loop");
        JButton nextButton=new JButton("Next Song");
        JButton preButton=new JButton("Previous Song");
        JButton forwardButton=new JButton("Forward");
        JButton backwardButton=new JButton("Backward");

        JPanel p=new JPanel();
        p.setLayout(new GridLayout(1,7));
        p.setBorder(BorderFactory.createTitledBorder("Created By Gioro Ulden"));

        f.add(p);//add the panel to the frame, without this sentence the buttons can't be seen

        p.add(playButton);
        p.add(pauseButton);
        p.add(loopButton);
        p.add(nextButton);
        p.add(preButton);
        p.add(forwardButton);
        p.add(backwardButton);

        //reaction to the click
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.play();
            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.pause();
            }
        });
        loopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.loop();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.nextSong();
            }
        });
        preButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.preSong();
            }
        });
        forwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.forward();
            }
        });
        backwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opa.backward();
            }
        });
        //end of clicks
    }
}
