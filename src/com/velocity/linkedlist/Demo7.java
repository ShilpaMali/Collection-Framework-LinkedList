package com.velocity.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {

		// input user
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the number>>");
			Scanner scanner = new Scanner(System.in); // 10
			int number = scanner.nextInt();
			l.add(number);
		}
		Iterator<Integer> itr = l.iterator(); //10 20 30
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
