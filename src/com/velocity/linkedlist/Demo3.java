package com.velocity.linkedlist;

import java.util.LinkedList;

public class Demo3 {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		// use for each loop
		for (Integer i : l) {
			System.out.println(i);
		}
	}

}
