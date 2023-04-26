import java.io.*;
import java.util.*;

public class FileTool{

    private FileInputStream in = null;
    private FileOutputStream out = null;
    public String fileName;

    public void setName(String newName){
        this.fileName = newName;
    }

}