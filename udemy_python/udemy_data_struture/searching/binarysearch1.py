
class BinarySearch:

    def binary_search1(self,lst,key):
        lower = 0
        higher = len(lst) -1
        found = False

        while lower <= higher and not found:
            middle = (lower+higher)//2 #floor division
            if key == lst[middle]:
                found = True
                return f"{key} is found at {middle}"

            elif key > lst[middle]:
                lower = middle + 1

            else:
                higher = middle-1

            if found == False:
                return f"{key} is not found"
