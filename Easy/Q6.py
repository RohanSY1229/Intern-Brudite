# Write a Python program to check if a given number is a perfect number

def func(num):
    sum = 0

    for i in range(1, num):
        if num % i == 0:
            sum = sum + i

    if sum == num:
        return "The number is a Perfect number"
    else:
        return "The number is not a Perfect number"

print(func(7))