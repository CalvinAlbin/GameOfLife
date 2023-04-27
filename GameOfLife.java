import java.io.*;
import java.util.*;

public class GameOfLife{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int generations;
        Grid g = new Grid();
        FileTool f = new FileTool();

        System.out.println("Enter File Name: ");
        f.fileName = sc.nextLine();
        f.FileToGrid(g);
    
        System.out.println("Enter Generations: ");
        generations = sc.nextInt();

        g.operate(generations);
        
        f.GridToFile(g);



        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                System.out.print(g.field[i][j] + " ");
            }
            System.out.println();
        }






        sc.close();
    }

}