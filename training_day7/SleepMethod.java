public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {
        // SleepMethod s = new SleepMethod();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\t");
            Thread.sleep(800);
        }
    }
}
