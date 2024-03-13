public class Fourth extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        Fourth t1 = new Fourth();
        Fourth t2 = new Fourth();
        Fourth t3 = new Fourth();

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());
        System.out.println("Priority of t3: " + t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());
        System.out.println("Priority of t3: " + t3.getPriority());

        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
