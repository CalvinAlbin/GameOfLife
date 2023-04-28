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

        sc.close();
    }

}