# 3. Write a Python program to input marks of five subjects Physics, Chemistry, Biology,
# Mathematics and Computer. Calculate percentage and grade according to following:
# Percentage >= 90% : Grade A
# Percentage >= 80% : Grade B
# Percentage >= 70% : Grade C
# Percentage >= 60% : Grade D
# Percentage >= 40% : Grade E
# Percentage < 40% : Grade F

def func3(phy,chem,bio,maths,computer):
    avg = phy+chem+bio+maths+computer

    if(avg>=90):
        return "Grade A"
    elif(avg>=80&avg<90):
        return "Grade B"
    elif(avg>=70&avg<80):
        return "Grade C"
    elif(avg>=60&avg<70):
        return "Grade D"
    elif(avg>=40&avg<60):
        return "Grade E"
    else:
        return "Grade F"

print(func3(23,44,99,89,97))