
class LinearSearch(object):
    def linear_search1(self,lst,key):
        index_list = [] # store all the index list,where key is present
        found = False
        for i in range(len(lst)):
            if lst[i] == key:
                found = True
                index_list.append(i)
                #return  f"{key} is found at {i}"

        if found:
             return index_list
        else:
            return f"{key} is not in the list"