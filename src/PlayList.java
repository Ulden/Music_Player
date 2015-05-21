import java.io.File;
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
    public PlayList(){
        name=new String("New Play List");
        items=null;
        item=new PlayListItem();
        currentItem=new PlayListItem(items.get(0));
        playListFile=new File("../lrc/"+name);
    }
    public PlayList(String name){
        this.name=new String(name);
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
    public void nextItem(){
        int index=items.indexOf(currentItem);
        if(index<items.size()-1) {
            currentItem = items.get(index + 1);
        }else{
            //tell user there is no more songs to play
        }
    }
    public void previousItem(){
        int index=items.indexOf(currentItem);
        if(index>1){
            currentItem=items.get(index-1);
        }else{
            //tell user there is no more songs to play
        }
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
            if(items.get(i).getName()==str){
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
