from stacks import stack1

class StackImplementation(object):

    def stackImp1(self):
        s1 = stack1.Stack()
        print(s1.is_empty())
        s1.push(1)
        s1.push(2)
        s1.push(3)
        print(s1.peek())
        s1.display()
        s1.pop()
        s1.display()
        print(s1.size())


