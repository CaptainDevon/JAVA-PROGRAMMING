public class Concurrent {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread t2=new Thread(new Running());

        t1.start();
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}
