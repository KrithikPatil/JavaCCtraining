public class DaemonThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Daemin thread: " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}