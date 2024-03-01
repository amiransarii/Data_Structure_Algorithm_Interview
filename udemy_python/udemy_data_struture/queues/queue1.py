#Enque(Push) [5,6,2,3,1] -> Dequeue(Pop)
#       Rear End        Front End

class Queue(object):

    def __init__(self):
        self.my_queue = []

    def is_empty(self):
        if self.my_queue == []:
            return True
        else:
            return False

    def enque(self,value):
        b =[value]
        self.my_queue = b +self.my_queue

    def dequeue(self):
        if self.my_queue ==[]: # self.is_empty()
            raise Exception("queues is empty")
        else:
            first_item = self.my_queue[-1]
            self.my_queue = self.my_queue[:-1]
            return first_item

    def peek(self):
        if self.is_empty():
            raise Exception("queues is empty")
        else:
            last_item = self.my_queue[0]
            return  last_item

    def size(self):
        count = 0
        for _ in self.my_queue:
            count += 1
        return count

    def display(self):
        print(self.my_queue)
