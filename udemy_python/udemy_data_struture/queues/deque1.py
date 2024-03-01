#Deque is also known as double ended queues
# Added rear or remove element from both end

class Dequeue(object):

    def __init__(self):
        self.my_deque =[] #initialize empty list

    def is_empty(self):
        if self.my_deque ==[]:
            return  True
        else:
            return False

    def add_front(self,value):
        b =[value]
        self.my_deque =self.my_deque + b

    def remove_front(self):
        if self.is_empty():
            raise Exception("Dequeue is Empty")
        else:
            first_item = self.my_deque[-1]
            self.my_deque = self.my_deque[:-1]
            return  first_item

    def add_rear(self,value):
        b = [value]
        self.my_deque  =b + self.my_deque

    def remove_front(self):
        if self.is_empty():
            raise Exception("Dequeue is Empty")
        else:
            first_item = self.my_deque[-1]
            self.my_deque = self.my_deque[:-1]
            return  first_item

    def remove_rear(self):
        if self.is_empty():
            raise Exception("Deque is Empty")
        else:
            last_item = self.my_deque[0]
            self.my_deque = self.my_deque[1:]
            return last_item

    def peek_Front(self):
        if self.is_empty():
            raise  Exception("Dequeue is Empty")
        else:
            first_item = self.my_deque[-1]
            return first_item

    def peek_rear(self):
        if self.is_empty():
            raise Exception("Dequue is Empty")
        else:
            last_item = self.my_deque[0]
            return last_item

    def size(self):
        count  = 0
        for _ in self.my_deque:
            count += 1
        return  count

    def display(self):
        print(self.my_deque)