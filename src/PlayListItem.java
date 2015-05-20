/**
 * Created by ulden on 15-5-20.
 */
public class PlayListItem {
    private String name;
    private String sourceLocation;

    //Construct Functions
    public PlayListItem(String name, String sourceLocation){
        this.setName(name);
        this.setSourceLocation(sourceLocation);
    }
    public PlayListItem(){
        name=null;
        sourceLocation=null;
    }

    //gets & sets
    public void setName(String str){
        this.name=str;
    }
    public String getName(){
        return this.name;
    }
    public void setSourceLocation(String str){
        this.sourceLocation=str;
    }
    public String getSourceLocation(){
        return sourceLocation;
    }
    //end of gets & sets
}
