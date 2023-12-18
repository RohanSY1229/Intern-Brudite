import math
# 8. Write a Python program to calculate the LCM (Least Common Multiple) of two
# numbers.
# number1 = 12, number2 = 18
# LCM of 12 and 18 is: 36

def cal_lcm(x, y):
    if x > y:
        greater = x
    else:
        greater = y

    while(True):
        if((greater % x == 0) and (greater % y == 0)):
            lcm = greater
            break
        greater += 1

    return lcm

print(cal_lcm(12,18))