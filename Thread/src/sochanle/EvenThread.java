package sochanle;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
          if(i % 2 == 0){
              System.out.println("số chẵn là : " + i);
          }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
