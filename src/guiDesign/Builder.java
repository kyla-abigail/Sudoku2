package guiDesign;


import java.util.Arrays;

public class Builder {
    private int input;
    private int guess;

    public static int[] fill ={1,2,3,4,5,6,7,8,9};

    //public static int [][] sudoku = new int[][];

    public Builder(int input) {
        setInput(input);



    }

    public int getInput() {
        return input;

    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public static int[][] Filler(int input){
        int [][] sudoku = new int[input][input];
        int choose = (int)(Math.random()*9);
        for(int i=0;i<input;i++){
            for(int j=0;j<input;j++) {
               sudoku[i][j] = fill[choose];
               for(int k=0;k<input;k++){
                   if(sudoku[i][j] == sudoku[i][k]){
                       choose = (int)(Math.random()*9);
                       sudoku[i][j] = fill[choose];
                   }
                   else if(sudoku[i][j] == sudoku[k][j]){
                       choose = (int)(Math.random()*9);
                       sudoku[i][j] = fill[choose];
                   }
                   else{
                       choose = (int)(Math.random()*9);
                   }
               }
            }
        }

        return sudoku;
    }

    public static int[][] Unknowns(int input) {
        int[][] blankArray = new int[input][input];
        int blank = (int) (Math.random() * 3);
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                blankArray[i][j] = blank;
            }
        }
        return blankArray;
    }

        public String toString() {
        return "Builder{" +
                "sudoku=" + Arrays.deepToString(Filler(getInput())) +
                '}';
    }
}
