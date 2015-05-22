import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 * This is the PlayList
 *
 * Created by ulden on 15-5-20.
 */
public class PlayList {
    private PlayListItem item;
    private List <PlayListItem> items;
    private String name;
    private File playListFile;
    private PlayListItem currentItem;

    //Construct functions
    public PlayList() throws MalformedURLException {
        name="New Play List";
        items=null;
        item=new PlayListItem();
        currentItem=new PlayListItem(items.get(0));
        playListFile=new File("../lrc/"+name);
    }
    public PlayList(String name) throws MalformedURLException {
        this.name=name;
        items=null;
        item=new PlayListItem();
        currentItem=new PlayListItem(items.get(0));
        playListFile=new File("../lrc/"+this.name);
    }


    //Functions
    public void appendToList(PlayListItem pli){
        items.add(pli);
    }
    public void removeFromList(PlayListItem pli){
        int place = items.indexOf(pli);
        items.remove(place);
    }
    public void addToList(PlayListItem pli, int place){
        items.add(place,pli);
    }
    public boolean nextItem(){
        int index=items.indexOf(currentItem);
        if(index<items.size()-1) {
            currentItem = items.get(index + 1);
            return true;
        }else{
            //tell user there is no more songs to play
            return false;
        }
    }
    public boolean previousItem(){
        int index=items.indexOf(currentItem);
        if(index>1){
            currentItem=items.get(index-1);
            return true;
        }else{
            //tell user there is no more songs to play
            //JOptionPane.showInternalMessageDialog(frame, "information","information", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    public void saveToFile() throws IOException{
        FileWriter fileWriter=new FileWriter("../files/PlayListFile.txt");
        for(int i=0; i<items.size();i++){
            fileWriter.write(String.valueOf(items.get(i)));
        }
        this.playListFile=new File("../file/PlayListFile.txt");
    }


    //gets & sets
    public void setName(String str){
        this.name=str;
    }
    public String getName(){
        return this.name;
    }
    public PlayListItem getItemByName(String str){
        PlayListItem tmpItem=new PlayListItem();
        for (int i = 0; i<items.size();i++){
            if(items.get(i).getName().equals(str)){
                tmpItem=items.get(i);
                break;
            }
        }
        return tmpItem;
    }
    public PlayListItem getItemByOrder(int ord){
        return items.get(ord);
    }
    public PlayListItem getCurrentItem(){
        return currentItem;
    }
    //end of gets & sets
}
