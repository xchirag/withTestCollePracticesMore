package com.fdmgroup.bufferreadwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BufferRead {

	
	List<String> lines = new ArrayList<>();

	public List<String> readWholeFileAsList(String filename) {
		try {
			Reader reader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// Do something to recover from the FileNotFoundException
			System.out.println(e.getMessage());
			System.out.println("fileeeee Notttt Found!");
			//e.printStackTrace();
		} catch (IOException e) {
			// Do something to recover from the IOException
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			
		}

		return lines;
	}

}
