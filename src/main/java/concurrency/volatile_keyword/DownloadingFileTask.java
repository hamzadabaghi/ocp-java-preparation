package concurrency.volatile_keyword;

public class DownloadingFileTask implements Runnable {

    private DownloadStatus status;
    private volatile boolean isDone;


    public DownloadingFileTask(DownloadStatus status) {
        this.status = status;
    }

    public DownloadingFileTask() {
    }

    @Override
    public void run() {
        for (var i = 0; i < 10_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }
        this.finished();
        System.out.println("Downloading the file is complete");

    }

    public boolean isDone() {
        return isDone;
    }

    public void finished() {
        isDone = true;
    }

}
