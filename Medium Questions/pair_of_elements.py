# 3. Given an array of N integers, and an integer K, find the number of pairs of elements
# in the array whose sum is equal to K.
# Sample Input: arr = [1, 2, 3, 4, 5], k = 6
# Sample Output: Pair count: 2

def pair_elements(l1,target):
    count = 0

    for i in range(1,len(l1) - 1):
        for j in range(i,len(l1) - 1):
            if l1[i] + l1[j] == target:
                count = count + 1
    
    return count

l1 = [1,2,3,4,5]
k = 6
print(pair_elements(l1,k))