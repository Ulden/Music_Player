import javax.swing.*;
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
    private File ListOfPlayList;
    //Construct
    public OperateFunctions(){
        try {
            currentMusic=Applet.newAudioClip(new URL("default.mp3"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String defaultname = "default";//get name of playlist from the PlayList.txt file.
        ListOfPlayList=new File(System.getProperty("user.dir")+"playlists.txt");
        if(ListOfPlayList.exists()) {
            try {
                Scanner scanner = new Scanner(ListOfPlayList);
                while (scanner.hasNextLine()) {
                    defaultname = scanner.nextLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        playList=new PlayList(System.getProperty("user.dir")+defaultname);
        try {
            currentMusic=Applet.newAudioClip(new URL(playList.getCurrentItem().getSourceLocation()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    //Operations
    public void play(){
        if(currentMusic!=null){
            currentMusic.play();
        }else{
            Object[] options={"OK"};
            JOptionPane.showOptionDialog(null,"No Music Detected","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null, options,options[0]);
        }
    }
    public void loop() {
        if (currentMusic!=null){
            currentMusic.loop();
        }else {
            Object[] options={"OK"};
            JOptionPane.showOptionDialog(null,"No Music Detected","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null, options,options[0]);
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
