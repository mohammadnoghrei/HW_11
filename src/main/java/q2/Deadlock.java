package q2;

public class Deadlock  extends Thread {
    static Thread mainThread;
    public void run()
    {
        System.out.println("Child Thread waiting for" +
                " main thread completion");
        try {

            mainThread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Child thread execution" +
                    " completes");
        }
    }
}
