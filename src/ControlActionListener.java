import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Action Listener for the Buttons
 *
 * Created by ulden on 15-6-3.
 */
public class ControlActionListener implements ActionListener {
    OperateFunctions opa;
    public ControlActionListener(){
        opa=new OperateFunctions();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().toString().equals("playButton")){
            opa.play();
        }else if(e.getSource().toString().equals("pauseButton")){
            opa.pause();
        }else if(e.getSource().toString().equals("loopButton")){
            opa.loop();
        }else if(e.getSource().toString().equals("nextButton")){
            opa.nextSong();
        }else if(e.getSource().toString().equals("preButton")){
            opa.preSong();
        }else if(e.getSource().toString().equals("forwardButton")){
            opa.forward();
        }else if(e.getSource().toString().equals("backwardButton")){
            opa.backward();
        }
    }
}
