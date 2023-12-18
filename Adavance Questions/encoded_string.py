# 9. Given an input string, write a function that returns the run length encoded string for
# the input string.
# Eg:
# Input: wwwwaaadebbbbbw
# Output: w4a3d1e1b5w1

def encoding(str):
    res = ""
    count = 1

    for i in range(1, len(str)):
        if str[i] == str[i - 1]:
            count += 1

        else:
            res += str[i - 1] + str(count)
            count = 1

        res += str[-1] + str(count)

    return res

print(encoding('aaassdkkffjjeexvb'))
