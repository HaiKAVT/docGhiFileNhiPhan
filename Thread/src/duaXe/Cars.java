package duaXe;

import java.util.Random;


public class Cars extends Thread{

    private String name;
    private int speed;

    public Cars(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis(); while (runDistance < 1000) {
            try {

                int speed = (new Random()).nextInt(20);

                runDistance += speed;

                String log = "|";
                int percentTravel = (runDistance * 100) / 1000;

                for (int i = 0; i < 1000; i += 2) {
                    if (percentTravel >= i + 2) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + 2) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(1000, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
    }

