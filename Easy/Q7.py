# 7. Write a Python program to check if a string is an anagram of another string.
# string1 = "listen", string2 = "silent"
# Output: True

def func(str1,str2):

    if(sorted(str1) == sorted(str2)):
        return True
    
    return False

str1 = "listen"
str2 = "silent"
print(func(str1,str2))