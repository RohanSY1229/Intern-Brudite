# 9. Write a Python program that executes an operation on a list and handles an
# IndexError exception if the index is out of range.

def func(list,idx):
    try: 
        res = list[idx]
        return res
    except:
        return('Index is out of range.')

l1 = [1,2,3,4,5]
print(func(l1,8))