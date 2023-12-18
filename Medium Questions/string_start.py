# 13. Write a Python program to find if a given string starts with a given character using
# Lambda.
# Sample input: input_string = "Hello, World!", given_char = "H"
# Sample Output: True

def check(str,target):

    res = lambda str, target: str.startswith(target)
    return res

string = "Hello, World!"
target = "H"

print(check(string,target))