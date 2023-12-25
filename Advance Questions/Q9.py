# 9. Given an input string, write a function that returns the run length encoded string for
# the input string.
# Eg:
# Input: wwwwaaadebbbbbw
# Output: w4a3d1e1b5w1

def encoding_string(str):
    if not str:
        return ""

    encoded = ""
    count = 1

    for i in range(1, len(str)):
        if str[i] == str[i - 1]:
            count += 1
        else:
            encoded += f"{str[i - 1]}{count}"
            count = 1

    encoded += f"{str[-1]}{count}"

    return encoded

string = 'aaassdkkffjjeexvb'
print(encoding_string(string))
