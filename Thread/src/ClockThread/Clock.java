package ClockThread;

public class Clock extends Thread{
    @Override
    public void run() {
        String s = null;
        String m = null;
        String h = null;
        for (int i =0 ; i < 60 ; i++){
            h = i + " : ";
            for (int j =0; j<60 ; j++){
                m = j + " : ";
                for (int k = 0; k <60; k++){
                    s = k + " : ";
                    System.out.println( h + m + k);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
