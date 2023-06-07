package concurrency.confinement;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /* ----- race condition ----------*/

        var status = new DownloadStatus();
        var tasks = new ArrayList<DownloadingFileTask>(10);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var task = new DownloadingFileTask();
            var thread = new Thread(task);
            thread.start();
            tasks.add(task);
            threads.add(thread);
        }

        for (var thread : threads) {
            thread.join();
        }

        var totalBytes = tasks.stream().mapToInt(t -> t.getStatus().getTotalBytes()).reduce(Integer::sum);

        System.out.println("the total number of bytes : " + totalBytes);
    }
}
