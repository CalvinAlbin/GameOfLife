

public class Cell extends Thread{
    public boolean status;
    public int row;
    public int col;
    public Grid g;


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
        return (g.field[r][c].status) ? 1 : 0;
    }

    public void run(){
        int counter = this.Count(row,col);
        if (counter  < 2)//Dead to underpopulation
            g.tempfield[row][col].status = false;
         else if (counter == 3)//living on or reproducing
              g.tempfield[row][col].status = true;
          else if (counter > 3)//Dying to overpopulation
             g.tempfield[row][col].status = false;
         else if (g.field[row][col].status == true)//living on if population is 2
            g.tempfield[row][col].status = true;
    }
}