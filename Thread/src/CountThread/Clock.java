package CountThread;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread{
    private JButton button;
    public Clock(JButton button){
        this.button = button;
    }
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        while (true){
            Date now = new Date();
            String st = simpleDateFormat.format(now);
            button.setText(st);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }
    }
}
