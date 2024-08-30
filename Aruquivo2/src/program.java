import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.sun.tools.javac.util.StringNameTable;


public class program {

	public static void main(String[] args) {
		
	String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
	
	String path = "c:\\temp\\out.txt";
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
		for (String line : lines) {
			bw.write(line);
			bw.newLine();
		}
		
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}
}