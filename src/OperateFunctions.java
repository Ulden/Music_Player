import javax.print.DocFlavor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.applet.*;
/**
 * All the Operations are here
 *
 * Created by ulden on 15-5-20.
 */
public class OperateFunctions {
    private AudioClip currentMusic;
    private AudioClip ac;
    private File file;
    private PlayList pll;
    //Construct
    public OperateFunctions() throws MalformedURLException {
        //file=new File();
        ac=null;
        pll=new PlayList();
    }


    //Basic functions
    private void getCurrentMusic(){
        //currentMusic=   ;
        file=pll.getCurrentItem().getFile();
    }


    //Operations
    public void play(){
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        currentMusic.play();
    }
    public void loop() {
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        currentMusic.loop();
    }
    public void stop() {
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        currentMusic.stop();
    }
    public void pause(){
        this.stop();
    }
    public void nextSong(){
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
    public void preSong(){

    }
    public void forward(){

    }
    public void backward(){

    }
    //end of Operation

    //gets & sets

}
