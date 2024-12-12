class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread extending Thread class: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: " + e.getMessage());
            }
        }
    }
}

class Running implements Runnable {
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread implementing Runnable interface: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
