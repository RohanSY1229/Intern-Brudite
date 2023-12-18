# 9. Write a Python program to count the frequency of each element in a list.
# input_list = [1, 2, 3, 2, 4, 1, 2, 4, 5]
# Frequency count: {1: 2, 2: 3, 3: 1, 4: 2, 5: 1}

def freq(l1):
 
    dict = {}
    for i in l1:
        dict[i] = dict.get(i, 0) + 1
    return dict

l1 = [1,1,2,3,4,5,6,3,2,2,1,3]
print(freq(l1))