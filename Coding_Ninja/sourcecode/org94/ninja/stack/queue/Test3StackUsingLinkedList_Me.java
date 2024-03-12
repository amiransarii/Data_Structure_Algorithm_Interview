package org94.ninja.stack.queue;


class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Test3StackUsingLinkedList_Me {

    //Define the data members
	Node1 head;


    public Test3StackUsingLinkedList_Me() {
        //Implement the Constructor
        head = null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        if(head == null){
            return 0;
        }
        int len = 0;
        Node1 curr = head;
        while (curr != null){
            len++;
            curr =curr.next;
        }
        return len;
       
    }

    public boolean isEmpty() {
       return head == null;
    }

    public void push(int element) {
    	Node1 newNode = new Node1(element);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if(head == null){
            return -1;
        }
        int tmp = head.data;
        head = head.next;
        return tmp;
    }

    public int top() {
          if(head == null){
            return -1;
        }
        int tmp = head.data;
        return tmp;
    }
}