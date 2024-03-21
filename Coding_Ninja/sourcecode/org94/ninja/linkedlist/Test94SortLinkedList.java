package org94.ninja.linkedlist;

/**
 * 
 * Problem statement
Given a linked list of 'N' nodes, which has nodes in alternating non-decreasing and non-increasing. 
Sort the list in non-decreasing order.



For Example:

If given linked list is 1->9->3->8->4 then it should be modified to 1->3->4->8->9.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
7
1 9 2 8 3 7 4 
Sample Output 1 :
1 2 3 4 7 8 9
Explanation to Sample Input 1 :
Since the given list is 1-> 9-> 2-> 8 -> 3 -> 7-> 4.
After sorting, it will be 1-> 2-> 3-> 4-> 7-> 8-> 9.
Sample Input 2 :
6
7 15 8 14 9 13
Sample Output 2 :
7 8 9 13 14 15    
Explanation to Sample Input 1 :
Since the given list is 7-> 15-> 8-> 14 -> 9 -> 13.
After sorting, it will be 7-> 8-> 9-> 13-> 14-> 15.
Expected Space Complexity:
Try to solve this problem in O(1) space complexity.


Constraints :

Explain
1 <= N <= 10^3
0 <= data <= 10^3 

Where 'N' is the length of the linked list.

Time Limit: 1 sec
/****************************************************************

 *
 */
public class Test94SortLinkedList {
	  public static Node sortList(Node head) {
	      /* Create 2 dummy nodes and initialise as 
	           heads of linked lists */
	        Node Ahead = new Node(0), Dhead = new Node(0); 
	  
	        // Split the list into lists 
	        splitList(Ahead, Dhead,head); 
	  
	        Ahead = Ahead.next; 
	        Dhead = Dhead.next; 
	  
	        // reverse the descending list 
	        Dhead = reverseList(Dhead); 
	  
	        // merge the 2 linked lists 
	        head = mergeList(Ahead, Dhead); 

	        return head;
	    }


	static void splitList(Node Ahead, Node Dhead,Node head) 
	    { 
	        Node ascn = Ahead; 
	        Node dscn = Dhead; 
	        Node curr = head; 
	  
	        // Link alternate nodes 
	  
	        while (curr != null) { 
	            // Link alternate nodes in ascending order 
	            ascn.next = curr; 
	            ascn = ascn.next; 
	            curr = curr.next; 
	  
	            if (curr != null) { 
	                dscn.next = curr; 
	                dscn = dscn.next; 
	                curr = curr.next; 
	            } 
	        } 
	  
	        ascn.next = null; 
	        dscn.next = null; 
	    } 


	    static Node reverseList(Node Dhead) 
	    { 
	        Node current = Dhead; 
	        Node prev = null; 
	        Node next; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        Dhead = prev; 
	        return Dhead; 
	    } 
	// A utility function to merge 
	    // two sorted linked lists 
	    static Node mergeList(Node head1, Node head2) 
	    { 
	        // Base cases 
	        if (head1 == null) 
	            return head2; 
	        if (head2 == null) 
	            return head1; 
	  
	        Node dummyHead = new Node(0); 
	        Node temp = dummyHead; 
	        while(head1 != null && head2 != null) { 
	            if (head1.data <= head2.data) { 
	                temp.next = head1; 
	                head1 = head1.next; 
	            } else { 
	                temp.next = head2; 
	                head2 = head2.next; 
	            } 
	            temp = temp.next; 
	        } 
	          
	        temp.next = (head1 != null) ? head1 : head2; 
	          
	        return dummyHead.next; 
	    } 
}


class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

