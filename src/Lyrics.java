import java.io.File;

/**
 * LyricsFiles
 *
 * Created by ulden on 15-5-20.
 */
public class Lyrics {
    private File lyricsFile;
    private String name;
    private String lyctype;
    //Construct
    public Lyrics(File f){
        name= f.getName();
        lyctype= "error";
        if(fileIsLeagle(f)) {
            lyricsFile = new File(f.getAbsolutePath());
        }
    }

    //functions
    public boolean fileIsLeagle(File file){
        if(!file.getName().isEmpty() && file.getName().length()>0){
            int x=file.getName().lastIndexOf('.');
            if(x>-1 && x<file.getName().length()-1){
                if(file.getName().substring(x+1).equals("txt")){
                    lyctype="txt";
                    return true;
                }else if(file.getName().substring(x+1).equals("lrc")){
                    lyctype="lrc";
                    return true;
                }//end of if else
            }//end of inner if
        }//end of outer if
        return false;
    }

    //get & set
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name=str;
    }
    public void setLyricsFile(File f){
        if(fileIsLeagle(f)) {
            lyricsFile = f;
        }
    }
    public String getLyctype(){
        return this.lyctype;
    }
    public File getLyricsFile(){
        return lyricsFile;
    }
    //end of get & set
}
