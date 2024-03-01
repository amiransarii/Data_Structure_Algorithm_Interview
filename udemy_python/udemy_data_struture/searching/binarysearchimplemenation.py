from  searching import  binarysearch1

class BinarySearchImpl(object):

    def binarySearch1(self):
        mlist =[2,3,5,7,9,11]
        key = 55
        res = binarysearch1.BinarySearch().binary_search1(mlist,key)
        print(res)