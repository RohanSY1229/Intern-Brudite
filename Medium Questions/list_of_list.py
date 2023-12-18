# Write a Python program to create a list of given strings individually of the list using
# Python map function.
# Eg.
# Input:
# ['Red', 'Blue', 'Black', 'White', 'Pink']
# Output:
# [['R', 'e', 'd'], ['B', 'l', 'u', 'e'], ['B', 'l', 'a', 'c', 'k'], ['W', 'h', 'i', 't', 'e'], ['P', 'i', 'n', 'k']]

def list_of_lists(l1):

    res = list(map(list,l1))

    return res

l1 = ['rohan', 'hello', 'hi', 'park', 'yellow']
print(list_of_lists(l1))