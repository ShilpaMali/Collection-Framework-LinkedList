package com.velocity.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		//2nd way use iterator
		Iterator<Integer> itr = l.iterator(); //itr contain 10 20 30
		while (itr.hasNext()) { //check elements
			System.out.println(itr.next()); //get actual value
		}
	}
}

