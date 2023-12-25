# 12. Create a login page backend to ask users to enter the username and password.
# Make sure to ask for a Re-Type Password and if the password is incorrect give
# chance to enter it again but it should not be more than 3 times.

def pass_check():
    username = input("Enter username: ")
    password = input("Enter password: ")
    count = 3

    for _ in range(3):
        re_enter = input("Re-Enter password: ")
        
        if re_enter == password:
            print("Login success")
            break
        else:
            count = count -1
            print("Incorrect password. Please try again. Attempts left :", count)
            

    else:
        print("Maximum attempts reached")

pass_check()