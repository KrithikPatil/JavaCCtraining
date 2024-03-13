public class ThreadFirst {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie) {
            System.out.println("Interrupted Exception occurred");
        }
    }
}
