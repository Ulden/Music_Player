import javax.print.DocFlavor;
import java.io.File;

/**
 * Created by ulden on 15-5-20.
 */
public class PlayListItem {
    private String name;
    private String sourceLocation;
    private File file;
    private Lyrics lrc;

    //Construct Functions
    public PlayListItem(File f, File lr){
        name=f.getName();
        sourceLocation=f.getAbsolutePath();
        file=new File(f.getAbsolutePath());
        lrc=new Lyrics(lr);
    }
    public PlayListItem(String source){
        setFilebyLocation(source);
        name=file.getName();
    }
    public PlayListItem(){
        name=null;
        sourceLocation=null;
    }
    public PlayListItem(PlayListItem pla){
        this.setFilebyLocation(pla.getSourceLocation());
        this.setName(pla.getName());
        this.setSourceLocation(pla.getSourceLocation());
        this.setLrc(pla.getLyrics());
    }

    //gets & sets
    public void setName(String str){
        this.name=str;
    }
    public String getName(){
        return this.name;
    }
    public void setSourceLocation(String url){
        this.sourceLocation=url;
    }
    public String getSourceLocation(){
        return sourceLocation;
    }
    public File getFile(){
        return file;
    }
    public void setFilebyLocation(String source){
        this.file=new File(source);
    }
    public Lyrics getLyrics(){
        return lrc;
    }
    public void setLrc(Lyrics l){
        lrc=l;
    }
    //end of gets & sets
}
