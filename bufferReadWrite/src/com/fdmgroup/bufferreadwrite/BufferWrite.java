/*
 * 2.	Write a small program to register a new user of a system.   
 * Your program should prompt the user for pertinent information (e.g. name, address, email etc).  
 * Then this information should be appended to a text file.  
 * Fields should be separated by commas. Each line in the file should be a record for a different user. 
 */

package com.fdmgroup.bufferreadwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class BufferWrite {
	
	
	
	public void writeLineToFile(String line){
		String filename = "exampleWrite.txt";
		try {
			Writer writer = new FileWriter(filename, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
				
			bufferedWriter.write(line);
			bufferedWriter.newLine();
				
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}


}
