import java.io.*;
import java.util.*;

public class FileTool{

    private FileReader in = null;
    private FileWriter out = null;
    public String fileName;


    public void FileToGrid(Grid g){
        try{
            in = new FileReader("input4.txt");

            char c;
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    c = (char) in.read();
                    if (c == 'X')
                        g.field[i][j] = true;
                    else
                        g.field[i][j] = false;
                }
            }


        }
        catch(Exception e){
            System.out.println("INCORRECT FILE NAME");
            //System.exit(-1);
        }
        finally{

        }




    }


    public void GridToFile(){
        try{
            out = new FileWriter("output.txt");
        }
        catch(Exception e){
            System.out.println("FILE ALREADY EXISTS");
            System.exit(-1);
        }
        finally{

        }

    }



}