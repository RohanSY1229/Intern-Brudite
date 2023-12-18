# 12. Write a Python program to reverse a number using a while loop.
# Sample Input: num = 12345
# Sample Output: revnum = 54321

def reverse_number(num):
    rev = 0
    
    while num > 0:
        digit = num % 10
        rev = rev * 10 + digit
        num //= 10
    
    return rev

num = 12345
print(reverse_number(num))
