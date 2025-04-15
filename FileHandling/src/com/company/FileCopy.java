package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	/**
	 * File handling -1
	 * 
	 * copy a File(pdf) and create a different file in the same location
	 * 
	 */

	public static void main(String[] args) {
		File file = new File("/Users/swade/Downloads/imp_pdf/NEW (2).pdf");

		File outFile = new File("/Users/swade/downloads/imp_pdf/demo.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			System.out.println(fileInputStream.available());

		} catch (IOException e) {
			e.printStackTrace();

		}

		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
