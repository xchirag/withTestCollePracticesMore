package com.fdmgroup.bufferreadwrite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BufferWriteMain {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		boolean more = true;
		BufferWrite bw = new BufferWrite();
		List<BufferWritetoObjects> listOfUsers = new ArrayList<>();

		while (more) {

			System.out.println("Enter your Name :");
			String name = s.nextLine();

			// System.out.println(name);

			System.out.println("Enter your Address: ");
			String address = s.nextLine();

			System.out.println("Enter your Email:");
			String email = s.nextLine();

			String line = name + "," + address + ", " + email;

			bw.writeLineToFile(line); // writing output to a file
			listOfUsers.add(new BufferWritetoObjects(name, address, email)); 
			// adding  as objects as per BufferWritetoObjects in list
			// above two lines are doing three things:
			// adding lines into a simple comma separated text files, 
			// ListofLines and then to User objects as well

			// System.out.println(line);

			System.out.println("do you want to add more users? Yes, No");
			String answer = s.nextLine();
			if (answer.equalsIgnoreCase("No"))
				more = false;
		}
		for (BufferWritetoObjects b : listOfUsers) {
			System.out.println(b.getAddress());
			System.out.println(b.getEmail());
		}
	}

}
