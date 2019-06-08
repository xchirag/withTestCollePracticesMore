package com.fdmgroup.bufferreadwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountedCompleter;

public class BufferRead1Exercise {
	
	List<String> lines = new ArrayList<>();
	int countE = 0;

	public int readSmallaTimesfromFile(String filename) {
		try {
			Reader reader = new FileReader(filename);
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			
			Iterator<String> strIter = lines.iterator();
			
			while (strIter.hasNext()){
				String temp = strIter.next();
				for (int i = 0; i < temp.length(); i++) {
					if(temp.charAt(i) == 'a')
						countE++;
				}
			}//countE will count only small a from the example file
			
			
		} catch (FileNotFoundException e) {
			// Do something to recover from the FileNotFoundException
			System.out.println(e.getMessage());
			System.out.println("fileeeee Notttt Found!");
			//e.printStackTrace();
		} catch (IOException e) {
			// Do something to recover from the IOException
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return countE;
	}

}
