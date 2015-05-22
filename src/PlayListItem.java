import javax.print.DocFlavor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Music Files and Lyrics Files are contained in one PlayListItem
 *
 * Created by ulden on 15-5-20.
 */

public class PlayListItem {
    private String name;
    private URL sourceLocation;
    private File file;
    private Lyrics lrc;

    //Construct Functions
    public PlayListItem(File f, File lr) throws MalformedURLException {
        name=f.getName();
        sourceLocation=new URL(f.getAbsolutePath());
        file=new File(f.getAbsolutePath());
        if(isLeagle()) {
            lrc = new Lyrics(lr);
        }
    }
    public PlayListItem(URL source){
        setFilebyLocation(source);
        name=file.getName();
        findLyrics();
    }
    public PlayListItem(){
        name=null;
        sourceLocation=null;
    }
    public PlayListItem(PlayListItem pla) throws MalformedURLException {
        this.setFilebyLocation(pla.getSourceLocation());
        this.setName(pla.getName());
        this.setSourceLocation(pla.getSourceLocation());
        this.setLrc(pla.getLyrics());
    }

    //functions
    public boolean isLeagle(){
        if(this.lrc.getName().equals(this.getName())){
            return true;
        }

        return false;
    }
    public void findLyrics(){
        File f=new File(this.sourceLocation+"/"+name);
        if(f.exists()){
            lrc=new Lyrics(f);
        }
    }

    //gets & sets
    public void setName(String str){
        this.name=str;
    }
    public String getName(){
        return this.name;
    }
    public void setSourceLocation(URL url) throws MalformedURLException {
        this.sourceLocation=url;
    }
    public URL getSourceLocation(){
        return sourceLocation;
    }
    public File getFile(){
        return file;
    }
    public void setFilebyLocation(URL source){
        this.file=new File(source.toString());
    }
    public Lyrics getLyrics(){
        return lrc;
    }
    public void setLrc(Lyrics l){
        lrc=l;
    }
    //end of gets & sets
}
