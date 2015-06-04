import java.applet.AudioClip;
import java.io.File;
import java.io.FileNotFoundException;
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
        currentMusic=null;
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
    }

    //Operations
    public void play(){
        currentMusic=playList.getCurrentItem().getName()
    }
    public void loop() {

    }
    public void stop() {

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
