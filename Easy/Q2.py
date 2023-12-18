# 2. Write a program that accepts a string as an input from the user and calculate the
# number of digits and letters.
# Hello123
# Alph -> 5 and number -> 3

def func2(str):
    countalpha = 0
    countnum = 0
    for i in str:
        if i.isalpha() :
            countalpha = countalpha + 1
        elif i.isnumeric() :
            countnum = countnum + 1
    return f"Alpha -> {countalpha} and number -> {countnum}" 

string = 'abc123'
print(func2(string))