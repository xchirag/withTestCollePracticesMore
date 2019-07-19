package com.winnow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainSprint {

	public static void main(String[] args) {
		System.out.println("hi there");

		MainSprint object = new MainSprint();

		object.binarySearch();

		object.tapeEquilibrium();
	}

	public void tapeEquilibrium() {

		// int[] arr = new int[] {2, 5, 7, 9, 3, 9, 10, 3, 2, 5};

		int[] A = new int[] { -1000, 1000, 1000};
		// Scanner s = new Scanner(System.in);
		// s.nextInt();
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		int end = A.length;
		int start = 0;
		int counter = 1;
		int tempMax = 0;
		List<Integer> diffList = new ArrayList<>();
		if (list.size() > 2) {

			for (Integer element : list) {
				int sumBegin = list.subList(start, counter).stream().mapToInt(Integer::intValue).sum();
				int sumEnd = list.subList(counter, end).stream().mapToInt(x -> x.intValue()).sum();
				counter++;
				tempMax = Math.abs(sumBegin - sumEnd);
				System.out.println(sumBegin + " " + sumEnd + " " + tempMax);
				diffList.add(tempMax);
			}
			// System.out.println(diffList.stream().min((x,y) -> x - y).get());
			System.out.println(diffList);

		}
		else
			System.out.println(A[0] - A[1]);

	}

	public void binarySearch() {
		System.out.println("done?");
	}

}
