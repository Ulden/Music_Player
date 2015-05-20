import java.io.File;

/**
 * Created by ulden on 15-5-20.
 */
public class Lyrics {
    private File lyricsFile;
    private String name;
    //Construct
    public Lyrics(File f){
        name=new String(f.getName());
        lyricsFile=new File(f.getAbsolutePath());
    }

    //get & set
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name=str;
    }
    public void setLyricsFile(File f){
        lyricsFile=f;
    }
    public File getLyricsFile(){
        return lyricsFile;
    }
    //end of get & set
}
