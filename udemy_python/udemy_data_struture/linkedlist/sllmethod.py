from entity import sllnode

class SLLMethod:

    def __init__(self):
        self.head = None

    def display(self):
        current = self.head
        while current is not None:
            print(current.get_data(),end="-->")
            current = current.get_next()


    def __repr__(self):
        return "SLL object: head={}".format(self.head)

    def is_empty(self):
        """Returns True if the Linked List is empty. Otherwise, returns False."""
        return self.head is None #self.head == None

    def add_front(self,new_data):
        """Add a Node whose data is the new_data argument to the front of the
                Linked List."""
        temp = sllnode.SLLNode(new_data)
        temp.set_next(self.head)
        self.head = temp

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
                return True
            else:
                current = current.get_next()
        return False

    def remove(self,key):
        """Removes the first occurence of a Node that contains the data argument
                as its self.data variable. Returns nothing.

                The time complexity is O(n) because in the worst case we have to visit
                every Node before we find the one we need to remove.
                """

        if self.head is None:
            return "Linked List is empty. No Nodes to remove."

        current = self.head
        previous = None
        found = False

        while not found:
            if current.get_data() == key:
                found = True
            else:
                if current.get_next() == None:
                    return "A Node with that data value is not present."
                else:
                    previous = current
                    current = current.get_next()

            if previous is None:
                self.head = current.get_next() #key found at first node
            else:
                previous.set_next(current.get_next()) #else in different place




