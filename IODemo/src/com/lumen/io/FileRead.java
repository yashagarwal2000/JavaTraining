package com.lumen.io;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



//read from console write into the file
public class FileRead {
	public static void main(String[] args) {
//		create an object for convertinf bytes to character
		InputStreamReader reader = new InputStreamReader(System.in);
//		create an object of buffer reader
		BufferedReader bufferedReader = new BufferedReader(reader);
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("demo.txt");
			String text = bufferedReader.readLine();
			fileWriter.write(text);
			do {
				text = bufferedReader.readLine();
				fileWriter.write(text);
				} while (!text.equals("Stop"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fileWriter != null)fileWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
