package com.velocity.linkedlist;

import java.util.LinkedList;

public class Demo5 {
	// Design method which return linkedlist object to that method
		public static LinkedList getLinkedList() {
			LinkedList l = new LinkedList();
			l.add(10);
			l.add(30);
			l.add(50);
			return l;
		}

		public static void main(String[] args) {
			LinkedList l1 = getLinkedList();
			System.out.println(l1);

		}

}
