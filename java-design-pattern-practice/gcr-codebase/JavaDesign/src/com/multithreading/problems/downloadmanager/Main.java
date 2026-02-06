package com.multithreading.problems.downloadmanager;

public class Main {
	public static void main(String[] args) {
		MyFileThread doc = new MyFileThread(new FileDownloader(), "Documnet.pdf.");
		MyFileThread image = new MyFileThread(new FileDownloader(), "Image.jpg");
		MyFileThread video = new MyFileThread(new FileDownloader(), "Video.mp4");		
		
		
		doc.setName("Doc Thread");
		image.setName("Image Thread");
		video.setName("Video Thread");
		
		
		// Download 3 files concurrently: “Document.pdf”, “Image.jpg”, “Video.mp4”
		doc.start();
		image.start();
		video.start();
		
		System.out.println("All downloads complete!");		
	}
}