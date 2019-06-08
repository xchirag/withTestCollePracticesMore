package com.fdmgroup;

import java.nio.channels.MulticastChannel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Runner {
	
	//public void runner(){}
	
	public void method(Runner runner){}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Runner r1 = new Runner();
		r1.method(null);*/
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDate birthDate = LocalDate.of(1976, 3, 20);
		System.out.println(birthDate);

		LocalDate yourBirthDate = LocalDate.of(1980, Month.APRIL, 15);
		System.out.println(yourBirthDate);

		// LocalDate d = new LocalDate(); // Does not compile

		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		birthDate.plusMonths(2);
		System.out.println(birthDate);
		birthDate.plusDays(15);
		System.out.println(birthDate);
		birthDate.plusYears(1);
		System.out.println(birthDate);

		// remember that the .plusMonths or other methods do not change the
		// original dates unless assigned to others and back!

		System.out.println();

		LocalDate afterDate = birthDate.plusMonths(2);
		System.out.println(afterDate);
		afterDate = birthDate.plusDays(15);
		System.out.println(afterDate);
		afterDate = birthDate.plusYears(1);
		System.out.println(afterDate);

		System.out.println("time manipulations");
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01
		
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time11 = LocalTime.of(5, 15);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time11)
		.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println("date Time 1 : " +dateTime1);
		
		
		
		LocalDate date3 = LocalDate.of(2015, 1, 20);
		LocalTime time4 = LocalTime.of(6, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time4);
		Period period = Period.ofMonths(1);
		System.out.println(date3.plus(period)); // 2015-02-20
		System.out.println(dateTime3.plus(period)); // 2015-02-20T06:15
		//System.out.println(time4.plus(period)); // UnsupportedTemporalTypeException
		
		
		StringBuilder sBuilder = new StringBuilder("abc");
		StringBuilder sBuilder2 = new StringBuilder("abc");
		System.out.println(sBuilder.equals(sBuilder2));
		
		String s1 = "bbc";
		String s2 = "bbc";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(sBuilder));
		
		//System.out.println(s2 == sBuilder);
		//cannot do string == stringbuilder but we can do string.equals(stringBuilder)
		
		//System.err.println("abc".charAt(3));
		
		String string = "012345678";
		System.out.println(string.substring(7));
		System.out.println(string.substring(7, 7));
		System.out.println(string.substring(1, 3));
		
		string += 2;
		System.out.println(string.length());
		
		//string.substring(2, 1);
		
		int[][] x = new int[5][];
		
		
		
		/*
		 * There are two paths through code with both a catch and a finally. If an exception
			is thrown, the finally block is run after the catch block. If no exception is thrown, the
			finally block is run after the try block completes.
			
			catch is not required if finally is present.
			
			subClass exception must declare ahead of superClass exception in multiple catch statements
			
			FileNotFoundException & IOException are checkedExceptions
			
			how to declare a new exception
			class NoMoreCarrotsException extends Exception {}
			
			then NoMoreCarrotsException can be caATChed
		 */
		
		//int answer = 11/0; => unchecked or runtime exception
		
		//following rule is only for checkedExceptions 
		//This rule applies only to checked exceptions.
		
		/*
		 * 				class Hopper {
						public void hop() throws CanNotHopException { }
						}
						
						class Bunny extends Hopper {
						public void hop() { }
						}
		 */
		
		//subclass does not require to throw exeception which is done by superClass as it is legal
		//though subclass method cannot throw exception if the superClass has not specified it
		//please note that the class is allowed to declare a subclass of an exception type.
		
		/*
		 * The reason that it’s okay to declare new runtime exceptions in a subclass method is that
			the declaration is redundant. Methods are free to throw any runtime exceptions they want
			without mentioning them in the method declaration. */
		
		/*
		 * Subclasses of java.lang.Error are exceptions that a programmer should not attempt to
			handle. Subclasses of java.lang.RuntimeException are runtime (unchecked) exceptions.
			Subclasses of java.lang.Exception, but not java.lang.RuntimeException are checked
			exceptions. Java requires checked exceptions to be handled or declared.
		 */
		
		// Java requires checked exceptions to be handled or declared. for eg IOexception and FileNotFoundException
		
		/*
		 * When a method overrides a method in a superclass or interface, it is not allowed to add
		checked exceptions. It is allowed to declare fewer exceptions or declare a subclass of a
		declared exception. Methods declare exceptions with the keyword throws.
		 */
		
		
		/*
		 * Differentiate between checked and unchecked exceptions. 
		 * Unchecked exceptions are also known as runtime exceptions and are subclasses of java.lang.RuntimeException. 
		 * All other subclasses of java.lang.Exception are checked exceptions.
		 */
		
		
		/*
		 * 
		 *  Differentiate between checked and unchecked exceptions. Unchecked exceptions are also
			known as runtime exceptions and are subclasses of java.lang.RuntimeException. All
			other subclasses of java.lang.Exception are checked exceptions.
			
			Understand the flow of a try statement. A try statement must have a catch or a finally
			block. Multiple catch blocks are also allowed, provided no superclass exception type
			appears in an earlier catch block than its subclass. The finally block runs last regardless
			of whether an exception is thrown.
			
			Identify whether an exception is thrown by the programmer or the JVM. Illegal
			ArgumentException and NumberFormatException are commonly thrown by the programmer.
			Most of the other runtime exceptions are typically thrown by the JVM.
			
			Declare methods that declare exceptions. The throws keyword is used in a method declaration
			to indicate an exception might be thrown. When overriding a method, the method is
			allowed to throw fewer exceptions than the original version.
			
			Recognize when to use throw versus throws. The throw keyword is used when you actually
			want to throw an exception—for example, ##throw new RuntimeException().## The
			throws keyword is used in a method declaration.
		 */

	}

	private void _a(){}
	public void $_a(){}
	//public void 1$(){}  method name can only start with _ $ or letters not with any number
	
	// public void walk2 { } // does not compile; because the method must have parameter list (even though empty!)
	
	// A vararg parameter must be the last element in a method’s parameter list. 
	// This implies you are only allowed to have one vararg parameter per method.
	
	//When calling a method with a vararg parameter, you have a choice. 
	// You can pass in an array, or you can list the elements of the array and let Java create it for you. 
	// You can even omit the vararg values in the method call and Java will create an array of length zero for you.
	
	public void met(){
		_a();
	}
	
	
	public void method1(int x, double y){}
	public void method1(int y){}
	public void method1(){}
	public void method1(double x, int y){} //this is still valid
	public void method1(Integer x, Double y){} // primitive and Wrapper types are different as here!
	public void method1(Integer x, double y){} // another example of primitive and wrapper different
	
	// when we call above using mehtod1(1, 1.0) Java tries to find out primitive if not found then auto-boxing kick off
	//public void method1(int xx, double yy){}
	//public void method1(int xx, double yy) throws RuntimeException {} parameters must be changed
	// A common use for static variables is counting the number of instances:
	
	// Java is a “pass-by-value” language.
	
	// order as follow when glide(1, 2) would be called
	// public String glide(int x, int y)
	// public String glide(Long x, Long y)
	// public String glide(Integer x, Integer y)
	// public String glide(int... x)
	
	/*
	 * Here we have a problem. Java is happy to convert the int 4 to a long 4 or an Integer 4.
		It cannot handle converting in two steps to a long and then to a Long. If we had public
		static void play(Object o) { }, it would match because only one conversion would be
		necessary: from int to Integer.
	 */
	
	// Creating Constructors
	// constructor is a special method that matches the name of the class and has no return type.
	// Constructor Name Must be As Class name with EXACT case match
	
	// constructor utilises for and called when instantiation process happens
	// the constructor method runs when object is created with NEW keyword
	
	// new keyword
	// memory allocated for new object * reference variable provided
	// A constructor is typically used to initialize instance variables.
	
	/*
	 * Having a private constructor in a class tells the compiler not to provide a default noargument constructor. 
	   It also prevents other classes from instantiating the class. 
	   This is useful when a class only has static methods or the class wants to control all calls to create new instances of itself.
	 */
	
	// this constructorName() would call one constructor from another constructor
	// though this constructorName() should be the first non-commented statement inside
	// this concept works in constructor chaining
	
	
	// places where final variables initialised are as under:
	
	// -> line of the declaration 
	// -> an instance initializer
	// -> in constructor
	
	
	// order of initialisation
	
	// start with superClass
	// static variables and static clause/initializers
	// main method will run ==> code which may appear before constructor in the method
	// instance variables and instance clause/initializers
	// constructors
	
	/*
	 * public class ImmutableSwan {
		private int numberEggs;
		public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
		}
		public int getNumberEggs() {
		return numberEggs;
		} }
	 * 
	 * above is the way how can we make a class immutable though it will still take initial value from user 
	 * via constructor and they can call getMthod to get value but no further changes to properties allowed
	 * 
	 * In this example, we don't have a setter. We do have a constructor that allows a value to
		be set. Remember, immutable is only measured after the object is constructed. Immutable
		classes are allowed to have values. They just can't change after instantiation.
		
		
		remember if we are passing back object reference variable then it will allow the users to make 
		changes as well
	 */
	
	/*
	 *  Static imports import static members.
		They are written as **import static**, not static import. 
		Make sure they are importing static methods or variables rather than classnames.
		// you do not require to add parameter name while importing static method
	 */
	
	// accessors/getters and mutators/setters
	
	// static * final variables must be set exactly once. 
	// It must be in the declaration line or in static initialisation block.
	
	 /*
	  * public class Zoo {
				}
			public class Zoo extends java.lang.Object {
			}
	  *  both of above are same
	  */
	
	// method signature includes the name and list of input parameters.
	// When you override a method, you may reference the parent version of the method using the super keyword. 
	// In this manner, the keywords this and super allow you to select between the current and parent version of a method, respectively.
	
	// this.method() -- child method 
	// super.method() -- parent method
	
	// method overriding
	
	// Parameter list: child and parent method signature (name/parameters) must be same
	// Return: child method must return same or subset of return of parent method
	// accessibility: child method must be same or more accessible then parent method
	// exception: child method cannot throw any new checked exception nor broader than exception thrown by parent 
	
	//*** above rules still apply in case of implementing the abstract methods as well ***//
	
	// final method cannot be overriden 
	// Note that whether or not the child method used the final keyword is irrelevant—the code will not compile either way.
	
	// the final modifi er is only used on methods when the author of the parent method wants to guarantee very precise behavior.
	// super.variableName can be used to access variable of parent class
	
	
	/*When defining a new variable in a child class, it is considered good coding practice to select a name for the variable that is not already a public, protected, or default variable
	in use in a parent class. Hiding private variables is considered less problematic because the child class did not have access to the variable in the parent class to begin with.*/

	/*An abstract class is a class that is marked with the abstract keyword and cannot be instantiated.
	An abstract method is a method marked with the abstract keyword defined in an abstract class, for which no implementation is provided in the class in which it is declared.*/

	//public abstract class Cow { public abstract void swim(); }
	//public abstract class Cow { public abstract void swim() {} } this would not compile as empty implementation of method provided
	
	// public abstract class Turtle {
			//public abstract void swim() {} // DOES NOT COMPILE
	//}
	
	// abstract class can have normal method with implementation
	// if not marked final these method can be overridden in derived class as well
	// therefore do not use final OR private with abstract (class or method) 
	// final private abstract cannot go together
	
	/*By definition, an abstract class is one that must be extended by another class to be instantiated, whereas a final class can’t be extended by another class. 
	 * By marking an abstract class as final, you’re saying the class can never be instantiated, so the compiler refuses to process the code.*/

	//*** above rules still apply in case of implementing the abstract methods as well ***//
	
	// A concrete class is the first nonabstract subclass that extends an abstract class 
	// and is required to implement all inherited abstract methods.
	
	// the order of code matters in this matter
	
	/*public abstract class Animal {
		public abstract String getName();
	  }
	  public class Bird extends Animal { // DOES NOT COMPILE
	  }
	  public class Flamingo extends Bird {
		public String getName() {
		return "Flamingo"; }
	  } because the first concrete class has not implemented all the abstract methods of the abstract class*/
	
	
	/*abstract classes can extend other abstract classes and are not required to provide implementations for any of the abstract methods.
	 * It follows, then, that a concrete class that extends an abstract class must implement all inherited abstract methods.*/
	
	/*if an intermediate class provides an implementation for an abstract method, that method is inherited by subclasses as a concrete method, not
	as an abstract one. In other words, the subclasses do not consider it an inherited abstract method because it is no longer abstract by the time it reaches the subclasses.*/

	/*Abstract Class Definition Rules:
		1. Abstract classes cannot be instantiated directly.
		2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract
		methods.
		3. Abstract classes may not be marked as private or final.
		4. An abstract class that extends another abstract class inherits all of its abstract methods
		as its own abstract methods.
		5. The first concrete class that extends an abstract class must provide an implementation
		for all of the inherited abstract methods.
		
		Abstract Method Definition Rules:
		1. Abstract methods may only be defined in abstract classes.
		2. Abstract methods may not be declared private or final.
		3. Abstract methods must not provide a method body/implementation in the abstract
		class for which is it declared.
		4. Implementing an abstract method in a subclass follows the same rules for overriding a
		method. For example, the name and signature must be the same, and the visibility of
		the method in the subclass must be at least as accessible as the method in the parent
		class and other rules from following */
	
	// method overriding
	
		// Parameter list: child and parent method signature (name/parameters) must be same
		// Return: child method must return same or subset of return of parent method
		// accessibility: child method must be same or more accessible then parent method
		// exception: child method cannot throw any new checked exception nor broader than exception thrown by parent 
	
}
