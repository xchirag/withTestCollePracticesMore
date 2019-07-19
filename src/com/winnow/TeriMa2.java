package com.winnow;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeriMa2 {

	public static void main(String[] args) {

		TeriMa2 object = new TeriMa2();

		String[] array = new String[] { "..X...", "......", "....X.", ".X....", "..X.X.", "...O.." };
		object.solution(array);
	}

	public int solution(String[] B) {

		int indeXo= 0;
		Stream<String> stream = Stream.of(B);
		int numberOfString = 0;
		
		List<String> collect = stream.collect(Collectors.toList());
		// numberOfString = which string contains the O
		// indeXo = at what index
		for(String element: collect) {
			if(element.contains("O")) {
				numberOfString = collect.indexOf(element);
				indeXo = element.indexOf("O");
				System.out.println(element + " "+ indeXo + " " + numberOfString);
			}
		}
		
		for(int x = numberOfString - 1 ; x >0 ;x--) {
			String stringOneAbove = collect.get(x);
			//System.out.println(stringOneAbove);
			if(stringOneAbove.contains("X")) {
//				String[] split = stringOneAbove.split("");
//				for(String ele : split) {
//					System.out.print(ele + "  ");
//					if(ele.equals("X")) {
//						System.out.println(ele.indexOf(ele));
//					}
//				}
				
				//System.out.println(stringOneAbove.indexOf("X"));
				
				for(int p = 0; p<stringOneAbove.length() -1; p++) {
					if(stringOneAbove.charAt(p) == 'X') {
						System.out.print(p);
						if((p == (indeXo -1) || p == (indeXo + 1))) {
							//then add further condition to varify the move can be made or not 
							// if can be then further move to be added and then printed
						}
					}
				}
				System.out.println();
				
			}
			else
				return 0;
			
		}
		
		
//		stream.forEach(x -> {
//			if (x.contains("O")) {
//				System.out.println(x.indexOf("O") + " " + x);
//				indeXo = x.indexOf("O");
//			}
//		});
		return 0;

	}
}
