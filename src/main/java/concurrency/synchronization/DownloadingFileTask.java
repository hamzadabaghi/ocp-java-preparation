package concurrency.synchronization;

public class DownloadingFileTask implements Runnable {

    private DownloadStatus status;


    public DownloadingFileTask(DownloadStatus status) {
        this.status = status;
    }

    public DownloadingFileTask() {
    }

    @Override
    public void run() {
        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }
        System.out.println("Downloading the file is complete");
    }
}
