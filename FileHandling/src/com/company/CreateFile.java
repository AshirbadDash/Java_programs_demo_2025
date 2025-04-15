package com.company;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		String path = "C:\\Users\\swade\\Downloads\\sample.txt";

		File file = new File(path);

		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("file is getting created.......");
			} else {
				System.out.println("file is already present");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
