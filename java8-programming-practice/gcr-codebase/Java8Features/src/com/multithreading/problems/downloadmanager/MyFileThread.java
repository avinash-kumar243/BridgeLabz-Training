package com.multithreading.problems.downloadmanager;

public class MyFileThread extends Thread {
	private FileDownloader fileDownloader;
	private String file;
	
	public MyFileThread(FileDownloader fileDownloader, String file) {
		this.fileDownloader = fileDownloader;
		this.file = file;
	}
	
	@Override
	public void run() {
		fileDownloader.fileDownloading(file);
	}
}	