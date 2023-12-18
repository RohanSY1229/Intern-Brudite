# 4. Write a Python program to find the sum of all odd numbers between two given
# numbers.
# Start = 1, stop = 10
# Sum of odd numbers: 25

def fun4(start,end):
    sum = 0
    for i in range(start,end+1):
        if(i % 2 != 0):
            sum = sum + i

    return sum
print(fun4(1,10))