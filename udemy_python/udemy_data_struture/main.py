from stacks import stackimplement
from queues import queuedequeimplementation
from searching import linearsearchimplementation
from searching import binarysearchimplemenation
from sortings import sortingimplementation
from linkedlist import  sllimplementation

def stackImp(): # stack implementation
    stackimplement.StackImplementation().stackImp1()

def queueImp(): #que implementation
    queuedequeimplementation.QueueDQImplemenation().queueImpl1()
    queuedequeimplementation.QueueDQImplemenation().dequeImpl1()

def searchImpl():
    #linearsearchimplementation.LinearSearchImp().linearSearch1()
    binarysearchimplemenation.BinarySearchImpl().binarySearch1()

def sortingImp():
    #sortingimplementation.SortImpl().buubleSort1()
    sortingimplementation.SortImpl().selectionSort1()

def linkedListImp():
    sllimplementation.SLLImplementation().process()







# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    #stackImp() # call stackImp Method
    #queueImp()
    #searchImpl()
    #sortingImp()
    linkedListImp()



