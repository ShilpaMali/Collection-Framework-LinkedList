package com.velocity.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo2 {
	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		l.add("pune");
		l.add("mumbai");
		l.add("bangalore");
		// use iterator
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) { //check elements
			System.out.println(itr.next()); //get actual value
		}
	}

}
