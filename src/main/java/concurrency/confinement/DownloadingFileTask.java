package concurrency.confinement;

import concurrency.concurrency_issues.race_condition.DownloadStatus;

public class DownloadingFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadingFileTask() {
        this.status = new DownloadStatus();
    }

    public DownloadStatus getStatus() {
        return status;
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
