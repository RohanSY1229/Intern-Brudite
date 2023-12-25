# 8. Write a Python function that counts the number of vowels in a given string.
# Sample Input: string = "Hello, World!"
# Sample Output: Number of vowels: 3

def count_vowels(str):

    set = "aeiouAEIOU"
    count = 0

    for char in str:
        if char in set:
            count += 1

    return count

string = "Hello, World!"
print(count_vowels(string))