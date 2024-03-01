
class SelectionSort:

    def selection_sort(self,lst):
        for i in range(len(lst)):
            min_val = min(lst[i:])
            min_index = lst.index(min_val)
            lst[i], lst[min_index] = lst[min_index],lst[i]

        return lst