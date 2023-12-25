# Write a Python program to check if a number is a power of two using recursion.

def is_poweroftwo(n):

    if n ==1:
        return True
    elif n % 2 != 0:
        return False
    else:
        return is_poweroftwo(n // 2)
    
print(is_poweroftwo(16))