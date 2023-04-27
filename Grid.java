import java.util.ArrayList;

public class Grid {
    public boolean [][] field = new boolean[20][20];
    public ArrayList<Integer> alive = new ArrayList<Integer>();

    public boolean [][] tempfield = new boolean[20][20];
    public ArrayList<Integer> tempalive;

    public void operate(int generations){

        int counter = 0;
        for (int i = 0; i < generations; i++){
            for (int j = 0; j < 20; j++){
                for (int k = 0; k < 20; k++){
                    counter = this.Count(j,k);
                    if (counter  < 2)//Dead to underpopulation
                        tempfield[j][k] = false;
                    else if (counter == 3)//living on or reproducing
                        tempfield[j][k] = true;
                    else if (counter > 3)//Dying to overpopulation
                        tempfield[j][k] = false;
                    else if (field[j][k] == true)//living on if population is 2
                        tempfield[j][k] = true;
                }
            }
            //copying tempfield to field
            for (int l = 0; l < 20; l++){
                System.arraycopy(tempfield[l],0,field[l],0,20);
            }
        }
    }



    public int Count(int row, int col) {
        int n = 0;
        n += live(row-1, col-1);    //Top Left
        n += live(row-1, col);      //Top Middle
        n += live(row-1, col+1);    //Top Right
        n += live(row, col+1);      //Right
        n += live(row+1, col+1);    //Bottom Right
        n += live(row+1, col);      //Bottom Middle WORKING
        n += live(row+1, col-1);    //Bottom Left WORKING
        n += live(row, col-1);      //Left
        return n;
    }



    public int live(int r, int c) {
        if (r < 0 || r >= 20) return 0;
        if (c < 0 || c >= 20) return 0;
        return (field[r][c]) ? 1 : 0;
    }
}
