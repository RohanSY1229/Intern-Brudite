# 10. Write a Python program to reverse the order of words in a given sentence.
# input_sentence = “Hello, World! Welcome to Python programming.”
# Output after reverse = “programming. Python to Welcome World! Hello,”

def rev_sentence(str):

    words = str.split()

    rev_words = words[::-1]

    rev_str = ' '.join(rev_words)

    return rev_str

str = "hell0! Rohan this side."
print(rev_sentence(str))