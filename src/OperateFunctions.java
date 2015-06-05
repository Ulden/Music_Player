import java.applet.AudioClip;
import java.applet.Applet;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * All the Operations are here
 *
 * Created by ulden on 15-5-20.
 */
public class OperateFunctions {;
    private AudioClip currentMusic;
    private PlayList playList;
    //Construct
    public OperateFunctions(){
        //file=new File();
        String defaultname = null;//get name of playlist from the PlayList.txt file.
        try {
            Scanner scanner=new Scanner(new File("../playLists.txt"));
            while (scanner.hasNextLine()){
                defaultname=scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        playList=new PlayList(defaultname);
        try {
            currentMusic=Applet.newAudioClip(new URL(playList.getCurrentItem().getSourceLocation()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            currentMusic=null;
        }
    }

    //Operations
    public void play(){
        if(currentMusic!=null){
            currentMusic.play();
        }else{

        }
    }
    public void loop() {
        if (currentMusic!=null){
            currentMusic.loop();
        }else {

        }
    }
    public void stop() {
        if (currentMusic!=null){
            currentMusic.stop();
        }
    }
    public void pause(){
        this.stop();
    }
    public void nextSong(){
        playList.setCurrentItem(playList.getCurrentItemIndex()+1);
        this.play();
    }
    public void preSong(){
        playList.setCurrentItem((playList.getCurrentItemIndex()-1));
        this.play();
    }
    public void forward(){

    }
    public void backward(){

    }


    //end of Operation

    //gets & sets

}
