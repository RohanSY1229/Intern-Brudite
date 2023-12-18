# 1. Write a program in Python to perform the following operation:
# ● If a number is divisible by 3 it should print “Brudite” as a string
# ● If a number is divisible by 5 it should print “Python Training” as a string
# ● If a number is divisible by both 3 and 5 it should print “Brudite - Python
# Training” as a string.

def func1(num):
    if(num % 3 == 0):

        if(num % 5 == 0):
            return 'Brudite - Python Training'
        
        return 'Brudite'
    
    elif (num % 5 == 0):
        return 'Python Training'