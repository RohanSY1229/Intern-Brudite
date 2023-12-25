# 7. Write a Python function that finds the median of a list of numbers.
# Sample Input: number_list = [7, 2, 5, 1, 9, 3]
# Sample Output: Median: 4.5

def calculate_median(l1):
    list = sorted(l1)
    n = len(list)

    if n % 2 == 0:
        n1 = list[n // 2]
        n2 = list[n // 2 - 1]
        res = (n1 + n2) / 2
    
    else:
        res = n // 2

    return res
    
list = [7, 2, 5, 1, 9, 3]
print(calculate_median(list))