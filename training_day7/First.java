public class First {
    public static void main(String args[]) {
        MyThread m = new MyThread();
        m.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Parent thread");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child thread");
        }
    }
}