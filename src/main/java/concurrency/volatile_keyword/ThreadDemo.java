package concurrency.volatile_keyword;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /* ----- race condition ----------*/

        var status = new DownloadStatus();
        var task = new DownloadingFileTask(status);
        var thread = new Thread(task);
        var anotherThread = new Thread(() -> {
            while (!task.isDone()) {
            }
            ;
            System.out.println("second thread finished");
        });

        thread.start();
        anotherThread.start();

        thread.join();
        System.out.println("the total number of bytes : " + status.getTotalBytes());
    }
}
