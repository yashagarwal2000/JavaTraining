package com.lumen.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleRead {

		public static void main(String[] args) {
//			create an object for converting bytes to character
			InputStreamReader reader = new InputStreamReader(System.in);
//			create an object of the buffer reader
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			char value;
			try {
				value = (char)bufferedReader.read();
				System.out.print(value);
				while (value != 'q') {
					value = (char)bufferedReader.read();
					System.out.print(value);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}
}
