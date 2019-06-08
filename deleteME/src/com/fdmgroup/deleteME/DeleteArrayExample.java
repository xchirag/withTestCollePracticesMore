package com.fdmgroup.deleteME;

import java.time.LocalDate;

public class DeleteArrayExample {

	public static void main(String[] args) {

		// array itself is an object
		// so all array are reference type of variables which store references
		// to data it stores
		// continuous heap memory location which makes it FAST performance in
		// comparison to collections

		// declare
		// allocate
		// initialise

		// array type can be one of following only
		// class, abstract class, interface or any primitive data type

		// declare
		// array declaration creates a variable pointing to null

		// following all are valid for multidimensional array

		int[][] x;
		int y[][];
		String[] p[];

		// but we cannot declare array with sizes as under

		// int[3] q; // compile error
		// int[] q[3]; // compile error

		// allocate
		// use new key word and array size to allocate memore after declaration
		// once allocated all array elements stores default value as NEW keyword
		// is used

		// y[5][5] = new int[] []; // wont compile
		y = new int[1][5];
		p = new String[3][4];

		// int[] x[] p[] = new int[3][4][5]; //wont compile
		// int[5] x = new int[]; //invalid
		int[][][] yyy = new int[2][][]; // valid
		// int[] [] [] yyy = new int[][][2]; // invalid
		// int[] [] [] yyy2 = new int[][2][]; // cannot specify an array
		// dimension after empty dimension

		int xpy = 1, ypz = 2;
		int[] b = new int[xpy * ypz]; // valid!

		// ArrayIndexOutOfBoundException is a run time exception so it will not
		// generate any compile time error
		// though to access index must provide int char byte or short otherwise
		// compile time error

		// we can make an array pointing null but it cannot be deleted after
		// created
		x = new int[2][3];
		for (int i = 0, pq = 1; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				x[i][j] = pq++;
		}

		for (int i = 0, pq = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				System.out.print(x[i][j]);// = pq++;
			System.out.println();
		}
		
		// local dates are immutable just like string!
		LocalDate birthDay = LocalDate.of(1977, 02, 12);
		System.out.println(birthDay);
		System.out.println(birthDay.getDayOfYear());
		System.out.println(birthDay.minusDays(5));
		System.out.println(birthDay);
		
		//get methods use getHour()/getXXX() wherease minusHours()/minusXXX() and plusXXX() use plurals
		
		// when we combine array declaration, allocation and initialisation in one step then
		// donot specify size as JAVA automaticly computes based upon provided elements
		
		// with String it is always about methods therefore length is via method ==> length()
		// whereas Array is all about variables therfore it is via property ==> length for eg: x.length or with string string1.length();
		
		
		// to remove an element from arrayList use the iterator or ListInterator because
		// while doing it with this for each Object element in arrayList would result in error
		
		
		// add() add(position,value), set(position, value) set(), get() remove(int index) or remove (object o), size()
		// addAll(startingInsertionPosition, nameOfArraList)
		// clear() will remove all elemnets of the arrayList
		// arrayList can store duplicate values
		
		// myArrayList.clone() ==> clone copy ==> copy references but not the actual objects
		
	// reference variables can be used with == which results in true
		
		
	}
}
