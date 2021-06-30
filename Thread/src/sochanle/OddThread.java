package sochanle;

public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i %2 != 0){
                System.out.println("số lẻ là : " + i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
