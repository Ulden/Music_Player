import javax.print.DocFlavor;

/**
 * Created by ulden on 15-5-20.
 */
public class PlayListItem {
    private String name;
    private DocFlavor.URL sourceLocation;

    //Construct Functions
    public PlayListItem(String name, DocFlavor.URL sourceLocation){
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
    public void setSourceLocation(DocFlavor.URL url){
        this.sourceLocation=url;
    }
    public DocFlavor.URL getSourceLocation(){
        return sourceLocation;
    }
    //end of gets & sets
}
