
class Stack(object):

 # [2,3,4,5,6,9]
 # bottom     top
    def __init__(self):
        self.my_stack =[] #initilaizing empty stack


    # check is stack is empty or not
    def is_empty(self):
        if self.my_stack ==[]:
            return  True
        else:
            return False

    #push the element into stack
    def push(self,value):
        b =[value] # assign list into a variable
        self.my_stack = self.my_stack + b # append the list into existing stack

    def pop(self):
        if self.my_stack == []:
            raise  Exception("Stack is Empty")
        else:
            popped_item = self.my_stack[-1] # last element
            self.my_stack = self.my_stack[:-1]

    def peek(self):
        if self.my_stack ==[]:
            raise Exception("Stack is Empty")
        else:
            top_item = self.my_stack[-1]
            return  top_item

    def size(self):
        count = 0
        for _ in range (len(self.my_stack)):
            count = count + 1
        return count #return size of the stack

    def display(self):
        print(self.my_stack)