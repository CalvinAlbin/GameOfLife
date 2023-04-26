import java.io.*;
import java.util.*;


public class FormatterTool {
    
    private FileInputStream in = null;
    private FileOutputStream out = null;
    public String fileName;

    public void setName(String newName){
        this.fileName = newName;
    }


    public boolean[][] read(String fileName){





        //Input File
        try{
            //in = new FileInputStream(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Incorrect File Name.");
            System.exit(-1);
        }
        
        //Output File
        try{
            File outFile = new File("output.txt");
            out = new FileInputStream("output.txt");
        }
        catch(Exception e){

        }
       

        
        return [][];
    }
}
