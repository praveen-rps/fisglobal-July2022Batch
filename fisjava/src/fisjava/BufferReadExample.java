package io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader fin = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(fin);

		FileOutputStream fout = new FileOutputStream("d://fileout.txt");

		System.out.println("enter your name...");
		String name = br.readLine();
		System.out.println("The name is : " + name);
		char n[] = name.toCharArray();
		for (int i = 0; i < n.length; i++)
			fout.write(n[i]);
	}

}
