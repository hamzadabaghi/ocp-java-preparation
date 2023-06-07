package concurrency.concurrency_issues.race_condition;

import concurrency.basic_concepts.DownloadingFileTask;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /* ----- race condition ----------*/

        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadingFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            thread.join();
        }

        System.out.println("the total number of bytes : " + status.getTotalBytes());
    }
}
