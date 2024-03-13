public class Third extends Thread {
    public void run() {
        System.out.println("run() method");
    }

    public static void main(String[] args) {
        Third t1 = new Third();
        Third t2 = new Third();
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();
        t1.setName("Krithik");
        System.out.println("Name of t1 after changing: " + t1.getName());
        System.out.println("Name of t2 after changing: " + t2.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
