# 1. Write a Python program to find the common elements between two lists.
# Sample Input: l1 = [1, 2, 3, 4, 5] and l2 = [4, 5, 6, 7, 8]
# Sample output: [4, 5]

def common(l1,l2):

    commom_elements = list(set(l1) & set(l2))

    return commom_elements

l1 = [1,2,3,4,5]
l2 = [4,6,3,7,4,2]

print(common(l1,l2))