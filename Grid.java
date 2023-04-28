

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
        for (int j = 0; j < 20; j++){
            for (int k = 0; k < 20; k++){
                field[j][k].start();
            }
        }

        for (int i = 0; i < generations; i++){
            for (int j = 0; j < 20; j++){
                for (int k = 0; k < 20; k++){
                    field[j][k].run();
                }
            }
            for (int s = 0; s < 20; s++){
                for (int t = 0; t < 20; t++){
                    field[s][t].status = tempfield[s][t].status;
                }
            }
        }
    }

}
