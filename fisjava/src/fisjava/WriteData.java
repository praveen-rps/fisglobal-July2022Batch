package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("d://sample.txt");
		FileOutputStream fout = new FileOutputStream("d://output.txt");
		int c = fin.read();
		while (c != -1) {
			char ch = (char) c;
			fout.write(ch);
			c = fin.read();
		}
		System.out.println("File copy completed...");
		fin.close();
		fout.close();

	}

}
