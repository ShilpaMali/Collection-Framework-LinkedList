package com.velocity.linkedlist;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {

		LinkedList l = new LinkedList(); // create LinkedList
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(30); 
		
		// direct way
		
		l.add("java"); 
		l.addLast("pune");
		l.addFirst("pune");
		l.add(null);
		System.out.println("Using index>>" + l.get(3));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		// l.addFirst("velocity");
		System.out.println(l);
	}

}
