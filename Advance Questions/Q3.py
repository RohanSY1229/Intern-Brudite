# 3. Aditi has used a text editing software to type some text. After saving the article as
# WORDS.TXT, she realised that she had wrongly typed the alphabet “J" in place of
# alphabet “I" everywhere in the article.
# Write a function definition for JTOI() in Python that would display the
# corrected version of the entire content of the file WORDS.TXT with all the alphabet
# "J" to be displayed as an alphabet "I" on screen.
# Note: Assuming that WORD.TXT does not contain any J alphabet otherwise.

def JTOI():
    try:
        with open("WORDS.TXT", "r") as file:
            content = file.read().replace("J","I")
            print(content)
    except FileNotFoundError:
        print("File not founded.")