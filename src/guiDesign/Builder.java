package guiDesign;


import java.util.Arrays;

public class Builder {
    private int input;

    public static int [][] sudoku;

    public Builder(int input) {
        setInput(input);


    }

    public int getInput() {
        return input;

    }

    public void setInput(int input) {
        this.input = input;
    }




    public static String Filler(int input){
        //int [][] sudoku = new int[input][input];
        for(int i=0;i<input;i++){
            for(int j=0;j<input;j++) {
                int trial =(int) (Math.random() * 10);
                while(trial >= 0){
                    trial =(int) (Math.random() * 10);
                }
                sudoku[i][j] = trial;
            }
        }

        return Arrays.toString(sudoku);
    }

    /**public void setSudoku(int[][] sudoku) {
        Filler(sudoku,input);
    }**/

    @Override
    public String toString() {
        return "Builder{" +
                "sudoku=" + Filler(getInput())+
                '}';
    }
}
