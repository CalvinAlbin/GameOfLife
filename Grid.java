

public class Grid {
    public Cell [][] field = new Cell[20][20];
    public Cell [][] tempfield = new Cell[20][20];

    Grid(){
        for (int s = 0; s < 20; s++){
            for (int t = 0; t < 20; t++){
                field[s][t] = new Cell();
                tempfield[s][t] = new Cell();
            }
        }
    }

    public void operate(int generations){

        int counter = 0;
        for (int i = 0; i < generations; i++){
            for (int j = 0; j < 20; j++){
                for (int k = 0; k < 20; k++){
                    counter = field[j][k].Count(j,k,this);
                    System.out.print(counter + " ");
                    if (counter  < 2)//Dead to underpopulation
                        tempfield[j][k].status = false;
                    else if (counter == 3)//living on or reproducing
                        tempfield[j][k].status = true;
                    else if (counter > 3)//Dying to overpopulation
                        tempfield[j][k].status = false;
                    else if (field[j][k].status == true)//living on if population is 2
                        tempfield[j][k].status = true;
                }
                System.out.println();
            }
            //copying tempfield to field
            /*for (int l = 0; l < 20; l++){
                System.arraycopy(tempfield[l],0,field[l],0,20);
            }*/
            System.out.println();
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
