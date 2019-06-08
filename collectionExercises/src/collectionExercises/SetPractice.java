package collectionExercises;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 2)	Write a method that reads in a series of first names and eliminates duplicates by storing them in a Set. 
 * It should return the Set.
 */
public class SetPractice {
	
	TreeSet<Object> firstNameSet = new TreeSet<>();
	
	public static void main(String args[]){
		
		SetPractice se = new SetPractice();
		se.setMethodDemo();
		//System.out.println("jlsdk");
		for (Object object : se.firstNameSet) {
			System.out.println(object);
			
		}
		
	}
	
	public void setMethodDemo(){
		
		String name1 = "Victor";
		String name2 = "Victor";
		String name3 = "Pazzi";
		firstNameSet.add(name1);
		firstNameSet.add(name2);
		firstNameSet.add(name3);
	}

}

/*
 * 

// following is output here:
Pazzi
Victor

// which means that duplicate values have been removed
// and they are sorted as per characteristics of TreeSet

 */

