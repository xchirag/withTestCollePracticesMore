package com.fdmgroup.bufferreadwrite;

import java.util.Iterator;
import java.util.List;

public class ReaderMainClass {

	public static void main(String[] args) {
		String filename = "example.txt";
		BufferRead fileReader = new BufferRead();
		List<String> allLines = fileReader.readWholeFileAsList(filename);
		//int temp1 = 0;
		for (String tempLine : allLines) {
			//if (temp1 == 1)
				System.out.println(tempLine); // to print only the second line
												// of the file
			//temp1 += 1;
		}
		useIteratoronReturnedList(allLines);

		int j = howToUseCharAt();
		System.out.println(j);
		
		findSmallaFromFile(filename);
	}

	private static void findSmallaFromFile(String filename) {
		BufferRead1Exercise brA = new BufferRead1Exercise();
		System.out.println(brA.readSmallaTimesfromFile(filename));
	}

	private static void useIteratoronReturnedList(List<String> allLines) {
		System.out.println("via Iterator");
		Iterator<String> iterator = allLines.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp);
			//System.out.println(temp.substring(0, 4));
			System.out.println();
		}
	}

	private static int howToUseCharAt() {
		String p = "aAaAbBcCdE";
		int j = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.substring(i, i + 1).equalsIgnoreCase("A"))
				j++;
			System.out.println(p.charAt(i));
		}
		return j;
	}
}
