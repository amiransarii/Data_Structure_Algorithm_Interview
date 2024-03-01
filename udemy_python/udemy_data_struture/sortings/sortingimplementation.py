from sortings import bubblesort1
from sortings import selectionsort1

class SortImpl:

    def buubleSort1(self):
        lst = [11,17,6,28,0]
        print("UnSorted List: ",lst)
        res = bubblesort1.BubbleSorting().bubble_sort1(lst)
        print("Sorted List:  ",res)

    def selectionSort1(self):
        lst = [11, 17, 6, 28, 0]
        print("UnSorted List: ",lst)
        res = selectionsort1.SelectionSort().selection_sort(lst)
        print("Sorted List: ",res)

