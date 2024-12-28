package com.velocity.linkedlist;

import java.util.LinkedList;

public class Demo6 {
	// Design method which return linkedlist object to that method
		public static LinkedList<Integer> getLinkedList() {
			LinkedList<Integer> l = new LinkedList<Integer>();
			l.add(10);
			l.add(30);
			l.add(50);
			return l;
		}

		public static void main(String[] args) {
			LinkedList<Integer> l1 = getLinkedList();
			System.out.println(l1);

		}

}
