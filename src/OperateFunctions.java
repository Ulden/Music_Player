import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
/**
 * All the Operations are here
 *
 * Created by ulden on 15-5-20.
 */
public class OperateFunctions {
    private AudioClip currentMusic;
    private PlayList playList;
    //Construct
    public OperateFunctions(){
        //file=new File();
        currentMusic=null;
        File ListOfPlayList=new File("../playLists.txt");
        String name;//get name of playlist from the PlayList.txt file.
        playList=new PlayList(name);

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
