package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.io.FileReader;
import java.io.IOException; 

public class Read {

	public static void main(String[] args) {
		// Define the file or path to read
	String filename = "C:\\SPFiles\\FileToRead.txt";
	String text = null;
	
	//create file in java
	File file = new File(filename);
	BufferedReader br;
	try	{
		br = new BufferedReader(new FileReader(file));
	}	catch (FileNotFoundException e)	{
		System.out.println("ERROR: FILE NOT FOUND:" + filename);
		e.printStackTrace();
	}	catch (IOException e)	{
			System.out.println("ERROR COULD NOT READ THE DATA" + filename);
			e.printStackTrace();
	}	finally	{
			System.out.println("FINISHED READING THE FILE");
	}

		System.out.println(text);
	
		
	}