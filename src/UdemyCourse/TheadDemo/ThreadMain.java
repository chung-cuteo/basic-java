package UdemyCourse.TheadDemo;

public class ThreadMain {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        NumberThead th1 = new NumberThead();
        RunableThread thRunnable = new RunableThread();
        Thread th2 = new Thread(thRunnable);

        System.out.println("main thread start");

        th1.start();
        th2.start();

        System.out.println("main thread completed");


        }


}
