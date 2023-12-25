# Create a function that takes a list and returns a new list with unique elements of the
# first list.
# Sample Input: list1 = [1, 2, 2, 3, 4, 4, 5, 5]
# Sample Output: list2 = [1, 2, 3, 4, 5]

def uniques(l1):

    l2 = list(set(l1))
    return l2

l1 = [1,2,3,4,2,3,4,5,2]
print(uniques(l1))
