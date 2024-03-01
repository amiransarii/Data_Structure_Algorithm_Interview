package org.codingpractice.recursive;

import org.codingpractice.entity.SingleNode;

public class TestLengthLinkedList {
	
	
	private int getCount(SingleNode head) {
		
		if(head == null)
			return 0;
		
		else
			return 1 + getCount(head.getNext());
		
		
	}

}
