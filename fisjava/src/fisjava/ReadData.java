package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("d://sample.txt");

		int c = fin.read();
		while (c != -1) {
			char ch = (char) c;
			System.out.print(ch);
			c = fin.read();
		}

		fin.close();

	}

}
