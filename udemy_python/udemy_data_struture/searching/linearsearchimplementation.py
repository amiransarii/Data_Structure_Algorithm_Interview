from searching import linearsearch1
class LinearSearchImp:

    def linearSearch1(self):
        mlist = [1,4,7,3,5,8,5,2,5]
        key = 50
        res = linearsearch1.LinearSearch().linear_search1(mlist,key)
        print(res)