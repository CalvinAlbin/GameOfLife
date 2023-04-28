

public class Grid {
    public Cell [][] field = new Cell[20][20];
    public Cell [][] tempfield = new Cell[20][20];

    Grid(){
        for (int s = 0; s < 20; s++){
            for (int t = 0; t < 20; t++){
                field[s][t] = new Cell();
                tempfield[s][t] = new Cell();
                field[s][t].row = s;
                field[s][t].col = t;
                tempfield[s][t].row = s;
                tempfield[s][t].col = t;
                field[s][t].g = this;
                tempfield[s][t].g = this;
            }
        }
    }

    public void operate(int generations){

        for (int i = 0; i < generations; i++){
            for (int j = 0; j < 20; j++){
                for (int k = 0; k < 20; k++){
                    field[j][k].changeStatus(j, k);
                }
            }
            for (int s = 0; s < 20; s++){
                for (int t = 0; t < 20; t++){
                    field[s][t].status = tempfield[s][t].status;
                }
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
        return (field[r][c].status) ? 1 : 0;
    }
}
