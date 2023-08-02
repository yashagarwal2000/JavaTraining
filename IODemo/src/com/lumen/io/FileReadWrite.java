package com.lumen.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
	public static void main(String[] args) {
		
	
	FileReader fileReader = null;
	FileWriter fileWriter = null;
	
	try {
		fileReader = new FileReader("trial.txt");
		fileWriter = new FileWriter("demo.txt");
		int num = fileReader.read();
		char value = (char)text;
		fileWriter.write(value);
	}
	
	
	try {
		int text = fileReader.read();
		fileReader.read(text);
	}
	
}
}