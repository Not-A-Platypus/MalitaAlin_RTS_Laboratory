package App4;


public class Main {
    private static final int processorLoad=1000000;

    public static void main(String args[]){

        Window win = new Window();
        Square square;
        for(int i =0; i<4; i++){
            square = new Square(i,processorLoad);
            square.addObserver(win);
            square.thread.start();

        }

    }
}