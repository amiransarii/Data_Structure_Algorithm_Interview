from entity import dllnode
class DLLMethod:

    def __init__(self):
        self.head = None

    def __repr__(self):
        return "<DLL object: head=>".format(self.head)

    def is_empty(self):
        return self.head is None

    def size(self):
        """Traverses the Linked List and returns an integer value representing
               the number of nodes in the Linked List.

               The time complexity is O(n) because every Node in the Linked List must
               be visited in order to calculate the size of the Linked List.
               """
        size = 0
        if self.head is None:
            return 0

        current = self.head
        while current is not None:# While there are still Nodes left to count
            size += 1
            current = current.get_next()
        return size

    def search(self,data):
        """Traverses the Linked List and returns True if the data searched for
                is present in one of the Nodes. Otherwise, it returns False.

                The time complexity is O(n) because in the worst case, we have to visit
                every Node in the list.
                """

        if self.head is None:
            return "Linked List is empty. No Nodes to search."

        current = self.head
        while current is not None:
            if current.get_data() == data:
                return  True
            else:
                current = current.get_next()
        return False

    def add_front(self,new_data):
        """Add a Node whose data is the new_data argument to the front of the
               Linked List."""
        temp = dllnode.DLLNode(new_data)
        temp.set_next(self.head)

        if self.head is not None:
            self.head.set_previous(temp)
        self.head = temp

    def remove(self,data):
        """Removes the first occurence of a Node that contains the data argument
               as its self.data attribute. Returns nothing.

               The time complexity is O(n) because in the worst case, we have to visit
               every Node before finding the one we want to remove.
               """

        if self.head is None:
            return "Linked List is empty. No Nodes to remove."

        current = self.head
        found = False

        while not found:
            if current.get_data() == data:
                found = True
            else:
                if current.get_next() is None:
                    return "A Node with that data value is not present."
                else:
                    current = current.get_next()

        if current.previous is None:
            self.head = current.get_next()

        else:
            current.get_next().setprevious(current.get_previous())
