package guiDesign;



public class Input {
    public static void main(String[] args) {

        Builder input1 = new Builder(9);
        int choose = (int)(Math.random()*9);
        System.out.print(input1);
    }
}
