package chapter_6_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		//you have to handle them
		try {
			BufferedReader br = new BufferedReader(new FileReader("wefwe"));
			br.read();
		} catch (FileNotFoundException e) {
			// thrown programmatically, subclass of IOException, can`t find file 
		} catch (IOException e) {
			// thrown programmatically, can`t read/write file 
		}

	}

}
