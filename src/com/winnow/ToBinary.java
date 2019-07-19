package com.winnow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToBinary {
	public static void main(String[] args) {
		int number = 265;
		number = 170;
		number = 25;
		number = 1024;
		number = 1026;
		number = 529;
		number = 1024;
		number = 1026523;
		ToBinary object = new ToBinary();
		int answer = object.solution(number);
		System.out.println(answer);
	}

	public int solution(int N) {
		
		int returValue = 0;
		String binaryString = Integer.toBinaryString(N);

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
					if (index >= size)
						break;

				}
				if (j != size - 1 && steps > 0) {
					// System.out.println(steps + " " + j);
					//System.out.println(steps);
					if(steps >= returValue)
						returValue = steps;
				}
				steps = 0;
			}
		}
		return returValue;
	}
}
