package org94.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;
import org.nininja.utils.Node;

public class Test91Insertion_Iterative_Me {
	public static LinkedListNode<Integer> insertionSort(LinkedListNode<Integer> head) {
		if (head.next == null) return head;
        LinkedListNode<Integer> headNew = head, tempOuter = head.next, lastInner = headNew, prevOuter = head;
        while (tempOuter != null) {
            LinkedListNode<Integer> tempOuterCopy = tempOuter;
            tempOuter = tempOuter.next;
            if (lastInner.data > tempOuterCopy.data) {
                if (tempOuterCopy.data < headNew.data) {
                    if (headNew.next != null && headNew.next.equals(tempOuterCopy)) {
                        headNew.next = null;
                    }
                    tempOuterCopy.next = headNew;
                    headNew = tempOuterCopy;
                } else {
                    LinkedListNode<Integer> fromHead = headNew, prevInner = headNew;
                    while (fromHead != null) {
                        if (tempOuterCopy.data < fromHead.data) {
                            prevInner.next = tempOuterCopy;
                            tempOuterCopy.next = fromHead;
                            if (fromHead.next != null && fromHead.next.equals(tempOuterCopy)) fromHead.next = null;
                            break;
                        }
                        prevInner = fromHead;
                        fromHead = fromHead.next;
                    }
                }
            } else {
                tempOuterCopy.next = null;
                lastInner.next = tempOuterCopy;
                lastInner = lastInner.next;
            }
        }
        return headNew;

	}

}
