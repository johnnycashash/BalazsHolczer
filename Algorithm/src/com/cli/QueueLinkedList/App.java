package com.cli.QueueLinkedList;

public class App {
	public static void main(String[] args) {
		QueueLinkedList<Integer> queue= new QueueLinkedList<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
	}
	
}
