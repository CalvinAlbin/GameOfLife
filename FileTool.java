import java.io.*;
import java.util.*;

public class FileTool{

    private FileReader in = null;
    private FileWriter out = null;
    public String fileName;


    public void FileToGrid(Grid g){
        try{
            in = new FileReader(fileName);

            char c;
            for (int i = 0; i < 20; i++){
                for (int j = 0; j < 20; j++){
                    c = (char) in.read();
                    if (c == 'X'){
                        g.field[i][j] = true;
                        g.alive.add((i*20 + j));
                    }
                    else
                        g.field[i][j] = false;
                }
                in.read();
                in.read();
            }

            in.close();
        }
        catch(Exception e){
            System.out.println("INCORRECT FILE NAME");
            System.exit(-1);
        }
        
    }


    public void GridToFile(Grid g){
        try{
            out = new FileWriter("output.txt");

            for (int i = 0; i < 20; i++){
                for (int j = 0; j < 20; j++){
                    if (g.field[i][j] == true)
                        out.write((int)'X');
                    else
                        out.write((int)'.');
                }
                out.write('\n');
            }

            out.close();
        }
        catch(Exception e){
            System.out.println("FILE ALREADY EXISTS");
            System.exit(-1);
        }

    }



}