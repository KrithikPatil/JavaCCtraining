public class Second {
    public static void main(String args[]) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Parent thread");
        }
    }
}

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child thread");
        }
    }
}