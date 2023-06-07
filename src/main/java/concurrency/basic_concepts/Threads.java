package concurrency.basic_concepts;

public class Threads {
    public static void main(String[] args) throws InterruptedException {

        /* -------- printing the number of active threads -------- */
        System.out.println("the number of active threads : " + Thread.activeCount()); // generally two : the main, and the GC

        /* -------- the total of threads available -------- */
        System.out.println("the total of threads available : " + Runtime.getRuntime().availableProcessors());


        /* -------- starting a thread ( example : downloading a file )--------- */
        Thread thread = new Thread(new DownloadingFileTask());
        // running the thread
        thread.start();

        // sleep the current thread for 10 seconds
        Thread.sleep(10000);

        //interrupting the thread
        thread.interrupt();

        // joining the thread
        thread.join();

        System.out.println("code is running after the thread 'thread' finished its execution");


    }
}
