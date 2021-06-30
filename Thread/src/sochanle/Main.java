package sochanle;

public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();

        OddThread oddThread = new OddThread();
        oddThread.start();
    }
}
