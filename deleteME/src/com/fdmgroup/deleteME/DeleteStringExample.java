package com.fdmgroup.deleteME;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeleteStringExample {
	
	static int x = 5;
	// static nested class

	public static void main(String[] args) {
/*
		int $x = 5;
		int _x = 6;
		System.out.println($x + " " + _x);

		// int 1x = 9; // this will not compile

		double d = 15_234_2.56_78D; // _ must be between two digits and not with .
		System.out.println(d);
		//int i = Integer.parseInt("12_34"); // invalid 
		// above code will compile but run time error
		System.out.println();
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println();
		
		String string = "We Love Java";
		System.out.println(string.substring(1)); // substring index as array index
		System.out.println(string.substring(2, 5)); // lastindex is not inclusive!
		System.out.println(string.substring(1, 7)); // end index is not inclusive though begin is!
		System.out.println("length of substring in such case:  " + string.substring(1, 7).length()); // therefore the length() is 6
		
		System.out.println(string.indexOf("Love")); // output would be 3 as Love starts from place 3
		System.out.println(string.indexOf("e")); // index of first occurance of first time in string
		
		// float f = 2.5; // will not compile as has to be make it double
		// though following will compile
		
		float f = 2.5f;
		double dou = 3.556; // because decimal values are defaulted to double whereas literals are defaulted to int
		
		long q = Integer.MAX_VALUE + 1;
		long p = (long) Integer.MAX_VALUE + 1;
		//int q = (Integer.MAX_VALUE + 1);

		System.out.println(q); // this is still integer as by default literals are integers if not specified 
		System.out.println(p);
		
		*/
		
		//Map playing
		//how to display keys and elements of a Map is shown as under:
		
		/*Map<Integer, String> stringMap = new HashMap<>();
		
		stringMap.put(1, "name");
		stringMap.put(2, "Age");
		
		System.out.println(stringMap.get(1));
		System.out.println(stringMap.get(2));
		//System.out.println(stringMap.keySet());
		
		Set<Integer> keys = stringMap.keySet();
		
		Iterator<Integer> iterator = keys.iterator();
		
		while(iterator.hasNext()){
			int temp = iterator.next();
			System.out.print(temp + " : ");
			System.out.println(stringMap.get(temp));
		}*/
		
		String string1 = "string1";
		String string = "string1";
		
		System.out.println(string1 == string); // this is true because with = operator it guides the reference to point to same object
		System.out.println(string1.equals(string)); // this is true as equals is the right method to test whether the strings are same or?!
		System.out.println();
		String string2 = new String("string2"); //NEW Keyword is only difference between string1 and string2
		String stringC = new String("string2");
		
		System.out.println(string2 == stringC); // this false as two *NEW* objects created
		System.out.println(string2.equals(stringC)); // this is true as equals is the right method to test whether the strings are same or?!
		
		System.out.println(string1.charAt(2)); // this will print r
		
		String dummy = "DummY DummY";
		System.out.println(dummy.indexOf('m'));
		System.out.println(dummy.indexOf('m', 3)); // output is 3 not 0!
		// it just starts from that character still showing first occurance counting from beginning
		
		System.out.println(dummy.indexOf('m', 4));
		System.out.println(dummy.indexOf('m', 5));
		System.out.println(dummy.indexOf("c")); // -1 becuase they cannot find this!
		
		//substring does not include end index into string
		//which means
		
		System.out.println(dummy.substring(2, 6));
		System.out.println(dummy.substring(2, 6).length());//mmy(space) only 4 characters
		
		// replace replaces the character/string occurance but would not compile if replacement/original are different as under types
		
		// System.out.println(dummy.replace('w', "q")); // this would not compile but following would
		System.out.println(dummy.replace('w', 'w'));
		System.out.println(dummy.replace("mmY", "123"));
		
		System.out.println(dummy.length()); // method is length() not size() with String!
		//size returns total number of characters // last character would be stored at length() - 1
		
		
		String aString = "ABCAB";
		System.out.println(aString.substring(0, 2).startsWith("A"));
		
		// starts with only take STrING as argument
		//System.out.println("ABCD".startsWith('A')); //will not compile
		
		// use StringBuilder when strings are updating frequently and the length is going to be big
		// StringBuilder ==> mutable strings
		
		// string returns by == does not get placed in string pool because by new keyword
		
		StringBuilder sBuilder = new StringBuilder();
		System.out.println("hi" + sBuilder);
		
		//StringBuilder pBuilder = "hi tehre";// this will not work
		// must use with new key word then!
		
		// when passed with a string it creates a stringbuilder lenght => 16 + length of passed string
		
		
		StringBuilder try1 = new StringBuilder("123456789");
		String string3 = "ABCDE";
		char[] name = {'A', 'B', 'C', 'D'};
		try1.append(string3, 1, 2);
		System.out.println(try1);
		
//		try1.insert(1, string3, 1, 2); // last works as substring in case of string!
//		System.out.println(try1);
		
//		try1.insert(2, name, 1, 3); // last 3 is length of string to be inserted in case of array of char
//		System.out.println(try1);
		
		// there is no *trim* method on stringbuilder
		// there is reverse method on stringbuilder but reverse will not use on substring of stringbuilder
		// delete does not delete last index when used on stringBuilder
		
		//System.out.println(string3.reverse()); // not possible!
		System.out.println(try1.reverse());
		System.out.println(try1.reverse());
		System.out.println(try1);
		System.out.println("length is : " + try1.length());
		// changes made by any function on stringBuilder is permanent 
		
		//replace in stringBuilder takes position  (start and end) whereas replace in string takes characters to replace
		
		System.out.println("abcdeabcde".replace("bc", "12"));
		StringBuilder try2 = new StringBuilder("0123456789");
		System.out.println(try2.replace(3, 8, "A"));// position left the last character here! it is like between 3 to 8!
		
		//subsequence method of stringBuilder does not modify actual stringBuilder value! and leaves the last character out!
		
		// stringBuffer methods are synchorised ensures that when we work with multiple threads it ensures that only one thread can execute this method
		// this prevents incosistency in instance variables while in mutlithread environment but peformance may degrade because of 
		// stringBuffer and synchorisation mechanism
		// this is differene between stringBuilder and stringBuffer otherwise all methods/functionalities are same
	}
	
	
		
}

//what is static variable
// what is class/object
//what is final
//encapsulation and related 4 questions in YBS to other guy


// String Pool == String Constant Pool
// new keyword always create a new string
// with = it only creates if the string is not there in constant pool (not previously created in the pool)
// with comparison if not found from the pool then it will be created

//strings are immutable
//means once created can never be modified
//so all time it will create a new string object
// immutability helps jvm into mainitaing string constant pool

// string = final Char[]
//string would not change in size once initialise


// all the methods whichh are normally being used on String class returns a new String object as per operation
// the original string value always remains the same!

// starts with only take STrING as argument
// 		//System.out.println("ABCD".startsWith('A')); //will not compile


// Use stringBuilder when updating string quite often and string length is big


// initial capacity is 16 characters for the stringBuilder if no arguement provided



