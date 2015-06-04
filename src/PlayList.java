import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the PlayList
 *
 * Created by ulden on 15-5-20.
 */
public class PlayList {
    private List <PlayListItem> items;
    private String name;
    private File playListFile;
    private PlayListItem currentItem;

    //constructor
    public PlayList(String name){
        this.name=name;
        playListFile=new File(this.name+".txt");
        currentItem=null;
        items=new ArrayList<PlayListItem>();
        writeToFile();
    }

    public void writeToFile(){
        try {
            FileWriter fileWriter=new FileWriter(playListFile,true);
            for (PlayListItem item : items) {
                fileWriter.write(item.getName() + ' ' + item.getSourceLocation() + '\n');
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addItemsToList(PlayListItem item){
        items.add(items.size(),item);
        if(currentItem==null){
            currentItem=items.get(items.size()-1);
        }
        writeToFile();
    }

    public void setCurrentItem(int index){
        currentItem=items.get(index);
    }
}
