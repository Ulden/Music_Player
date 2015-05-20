import javax.print.DocFlavor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.applet.*;
/**
 * Created by ulden on 15-5-20.
 */
public class OperateFunctions implements AudioClip{
    private AudioClip currentMusic;
    private File file;
    private AudioClip ac;
    //Construct
    public OperateFunctions(){
        //file=new File();
        ac=null;
    }

    //Operations
    @Override
    public void play(){
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        currentMusic.play();
    }
    @Override
    public void loop() {
        try{
            ac=Applet.newAudioClip(file.toURI().toURL());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        currentMusic.loop();
    }
    @Override
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
