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
        String defaultname;//get name of playlist from the PlayList.txt file.
        ListOfPlayList=
        playList=new PlayList(defaultname);
    }

    //Operations
    public void play(){

    }
    public void loop() {

    }
    public void stop() {

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
