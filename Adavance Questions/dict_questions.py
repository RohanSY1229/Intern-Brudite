def construct_dictionary_for_loops(students, subjects):
    student_subject_dict = {}

    for i in range(len(students)):
        student_subject_dict[students[i]] = subjects[i]

    return student_subject_dict

# Example Input
students_list = ["Alice", "Bob", "Charlie"]
subjects_list = ["Math", "Science", "History"]

# Construct dictionary using for loops
result_for_loops = construct_dictionary_for_loops(students_list, subjects_list)

print("Using For Loops:")
print("Students and Subjects Dictionary:", result_for_loops)
