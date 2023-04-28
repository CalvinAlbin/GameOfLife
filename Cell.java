

public class Cell{
    public boolean status;


    public int Count(int row, int col, Grid g) {
        int n = 0;
        n += live(row-1, col-1, g);    //Top Left
        n += live(row-1, col, g);      //Top Middle
        n += live(row-1, col+1, g);    //Top Right
        n += live(row, col+1, g);      //Right
        n += live(row+1, col+1, g);    //Bottom Right
        n += live(row+1, col, g);      //Bottom Middle WORKING
        n += live(row+1, col-1, g);    //Bottom Left WORKING
        n += live(row, col-1, g);      //Left
        return n;
    }



    public int live(int r, int c, Grid g) {
        if (r < 0 || r >= 20) return 0;
        if (c < 0 || c >= 20) return 0;
        return (g.field[r][c].status) ? 1 : 0;
    }

}