package UdemyCourse.TheadDemo;

public class RunableThread implements  Runnable{

    @Override
    public void run() {
      display();
    }

    private synchronized void display() {
        try {
            Thread.sleep(300);
            System.out.println("th 2");
        } catch (Exception e) {

        }
    }
}
