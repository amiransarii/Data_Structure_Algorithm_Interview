package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test2MergeTwoSortedLinkedList_Me {
public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        
        if(head1 == null && head2 == null){
            return null;
        }

        else if ( head1 == null){
            return head2;
        }

        else if (head2 == null){
            return head1;
        }

        else{
             Node<Integer> mergedHead = (head1.data< head2.data)? head1:head2;
             Node<Integer> currNode1 = mergedHead.next;
             Node<Integer> currNode2 = (mergedHead == head1) ? head2:head1;
             Node<Integer> tail= mergedHead;

             //Merge the two lists

             while (currNode1 != null && currNode2 != null){

                 if(currNode1.data < currNode2.data){
                    tail.next = currNode1;
                    tail = currNode1;
                    currNode1 = currNode1.next;
                 }

                 else{
                     tail.next = currNode2;
                     tail = currNode2;
                     currNode2 = currNode2.next;
                 }
             }

             if(currNode1 != null){
                 tail.next = currNode1;
             }
             else{
                 tail.next = currNode2;
             }

             return mergedHead;

        }
    }
}
