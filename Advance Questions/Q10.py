# 10. A cafe has N computers. Several customers come to the cafe to use these
# computers. A customer will be serviced only if there is any unoccupied computer at
# the moment the customer visits the cafe. If there is no unoccupied computer, the
# customer leaves the cafe.
# You are given an integer N representing the number of computers in the cafe and a
# sequence of uppercase letters S. Every letter in S occurs exactly two times. The first
# occurrence denotes the arrival of a customer and the second occurrence denotes the
# departure of the same customer if he gets allocated the computer.
# You have to find the number of customers that walked away without using a
# computer.

def customers_walked_away(N, S):
    stack = []
    walked_away = 0

    for char in S:
        if char not in stack:
            if len(stack) < N:
                stack.append(char)
            else:
                walked_away += 1
        else:
            stack.remove(char)

    return walked_away-1

N = 1
S = "ABCBAC"
result = customers_walked_away(N, S)
print(result)
