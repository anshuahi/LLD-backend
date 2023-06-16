package printNumber1to100;

public class NumberPrinter implements Runnable{
    private int n;

    NumberPrinter(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Number " + this.n +" printed by: " + Thread.currentThread().getName());
    }
}
