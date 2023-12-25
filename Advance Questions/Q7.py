# Write a program to construct a dictionary from the two lists containing the names of
# students and their corresponding subjects. The dictionary should map the students
# with their respective subjects. Let’s see how to do this using for loops and dictionary
# comprehension.

students = ["Rohan", "Harsh", "Prashant"]
subjects = ["Java", "Science", "English"]

# method 1
dict = {}
for i in range(len(students)):
  dict[students[i]] = subjects[i]

print(dict)

# method 2
dict2 = {student: subject for student, subject in zip(students, subjects)}
print(dict2)