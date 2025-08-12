class EvenThread extends Thread {
    public void run() {
        System.out .println(" the name of even thread: "+ Thread.currentThread().getName());
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted");
        }
    }
}

class OddThread extends Thread {
    public void run() {
    System.out .println(" the name of even thread: "+ Thread.currentThread().getName());

        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted");
        }
    }
}

public class twoTh {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
