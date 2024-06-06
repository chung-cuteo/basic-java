package UdemyCourse.TheadDemo;

public class NumberThead  extends Thread {
    @Override
    public void run() {
        display();
    }

    private synchronized void display() {
        try {
            Thread.sleep(400);
            System.out.println("th 1");
        } catch (Exception e) {

        }
    }
}
