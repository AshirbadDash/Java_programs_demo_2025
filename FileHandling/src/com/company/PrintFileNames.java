package com.company;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {
	public static void main(String[] args) {
		String path = "C:\\Users\\swade\\Downloads";

		File file = new File(path);
		File downloadDir[] = file.listFiles();

		Arrays.sort(downloadDir);

		for (File e : downloadDir) {
			if (e.isFile()) {
				System.out.println("File: " + e.getName() + " " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory: " + e.getName() + " " + e.getAbsolutePath());
			} else {
				System.out.println("not known" + e.getName() + " " + e.getAbsolutePath());
			}
		}

	}

}
