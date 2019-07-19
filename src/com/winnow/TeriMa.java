package com.winnow;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeriMa {

	public static void main(String[] args) {

		TeriMa object = new TeriMa();

		String[] array = new String[] { "..X...", "......", "....X.", ".X....", "..X.X.", "...O.." };
		object.solution(array);
	}

	public int solution(String[] B) {

		int positionOf = 0;
		Stream<String> stream = Stream.of(B);
		int numberOfString = 0;

		// numberOfString = which string contains the O
		// positionOf = at what index
		
		int howManyKills = 0;
		List<String> collect = stream.collect(Collectors.toList());
		
		// following loop is used to find out if any String contains O and relevant
		// position

		for (String element : collect) {
			if (element.contains("O")) {
				numberOfString = collect.indexOf(element);
				positionOf = element.indexOf("O");
			}
		}

		for (int x = numberOfString - 1; x > 0; x--) {
			String stringOneAbove = collect.get(x);
			if (stringOneAbove.contains("X")) {

				for (int p = 0; p < stringOneAbove.length() - 1; p++) {
					if (stringOneAbove.charAt(p) == 'X') {
						System.out.print(p);
						if ((p == (positionOf - 1) || p == (positionOf + 1))) {
							// then add further condition to varify the move can be made or not
							// if can be then further move to be added and then printed
							// howManyKills
						}
					}
				}
				System.out.println();

			} else
				return 0;

		}

		return howManyKills;

	}
}
