from linkedlist import sllmethod

class SLLImplementation(object):

    def process(self):
        sll_obj = sllmethod.SLLMethod()

        sll_obj.add_front(1)
        sll_obj.add_front(2)
        sll_obj.add_front(3)
        sll_obj.display()
        print(sll_obj.search(11))
