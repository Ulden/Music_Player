import java.util.List;

/**
 * Created by ulden on 15-5-20.
 */
public class PlayList {
    private PlayListItem item;
    private List <PlayListItem> items;
    private String name;

    //Construct functions
    public PlayList(){
        name=null;
        items=null;
        item=new PlayListItem();
    }


    //Functions
    public void appendToList(PlayListItem pli){
        items.add(pli);
    }
    public void removeFromList(PlayListItem pli){
        int place = items.indexOf(pli);
        items.remove(place);
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
    //end of gets & sets
}
