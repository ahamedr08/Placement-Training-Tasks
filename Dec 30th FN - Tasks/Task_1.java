public class Main {

    public static void main(String[] args) {
        // Create two threads using Runnable interface
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");

        // Start the threads
        t1.start();
        t2.start();

        // Fetch and print the names of the threads
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
    }

    // Runnable implementation
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
}
}
}