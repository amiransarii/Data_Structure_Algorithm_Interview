
class BubbleSorting():
    def bubble_sort1(self,mlst):
        for i in range(len(mlst)-1):
            for j in range(len(mlst)-1):
                if mlst[j] > mlst[j + 1]:
                    mlst[j], mlst[j + 1] = mlst[j + 1], mlst[j]  # python shortcut swap method
        return mlst



