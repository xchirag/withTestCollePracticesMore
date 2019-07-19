package com.winnow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToBinary2 {
	public static void main(String[] args) {
		int number = 265;
		number = 170;
		//number = 265;
		//number = 25;
		number = 1024;
		number = 1026523;
		String binaryString = Integer.toBinaryString(number);
		
//		long in = Long.parseLong(binaryString);
//		System.out.println(in);

		Stream<Character> sc = binaryString.chars().mapToObj(x -> (char) x);
		List<Character> list = sc.collect(Collectors.toList());
		List<Integer> listOfNumbers = new ArrayList<>();
		list.forEach(x -> listOfNumbers.add(Integer.parseInt("" + x)));
		System.out.println(listOfNumbers);

		int size = listOfNumbers.size();
		int index = 0;

		int steps = 0;
		index = 0;
		for (int j = 0; j < size; j++) {
			if (listOfNumbers.get(j) == 1) {
				index = j + 1;
				if (index >= size)
					break;
				while (listOfNumbers.get(index) == 0) {
					steps++;
					j++;
					index++;
					// System.out.print(steps);
					if(index >= size)
						break;
					
				}
				if(j != size-1 && steps > 0)
					//System.out.println(steps + " " + j);
					System.out.println(steps);
				steps = 0;
			}
		}
	}
}







/*



while(size > 0) {
if(listOfNumbers.get(index) == 1) {
	while(match != 1) {
		++index;
		match = listOfNumbers.get(index);
		steps++;
	}
	
}
else {
	steps = -1;
	++index;
}
System.out.println(steps);
if(index == size)
	break;
}


for (int j = size - 1; j >= 0; j--) {
if(listOfNumbers.get(j) == 0) {
	int steps = 0;
	while (listOfNumbers.get(j) == 0) {
		steps++;
		j--;
	}
System.out.println(steps);
}
}

for (int j = 0; j < size; j++) {
if(listOfNumbers.get(j) == 1) {
	int steps = 0;
	while (listOfNumbers.get(j) == 1) {
		steps++;
		j++;
	}
System.out.println(steps);
}
}



*/