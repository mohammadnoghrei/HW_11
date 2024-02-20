package q2;

public class MainQ2 {
    public static void main(String[] args)
            throws InterruptedException
    {
        Deadlock.mainThread = Thread.currentThread();
        Deadlock thread = new Deadlock();

        thread.start();
        System.out.println("Main thread waiting for " +
                "Child thread completion");

        // main thread is waiting for the completion
        // of Child thread
        thread.join();

        System.out.println("Main thread execution" +
                " completes");
    }
}

