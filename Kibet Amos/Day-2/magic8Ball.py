import random

def getAnswer(answerNumber):
    if answerNumber == 1:
        return 'It is certain'
    elif answerNumber == 2:
        return 'It is decidedly so'
    elif answerNumber == 3:
        return 'Yes'
    elif answerNumber == 4:
        return 'Reply hazy try again'
    elif answerNumber == 5:
        return 'Ask again later'
    elif answerNumber == 6:
        return 'Concentrate and ask again'
    elif answerNumber == 7:
        return 'My reply is no'
    elif answerNumber == 8:
        return 'Outlook not so good'
    elif answerNumber == 9:
        return 'Very doubtful'

r = random.randint(1, 9)
fortune = getAnswer(r)
print(fortune)


# You can view the execution of this program at https://autbor.com/magic8ball/. 
# When this program starts, Python first imports the random module ➊.
#  Then the getAnswer() function is defined 
#  ➋. Because the function is being defined (and not called),
#   the execution skips over the code in it.
#    Next, the random.randint() function is called with two arguments: 1 and 9
#     ➍. It evaluates to a random integer between 1 and 9 (including 1 and 9 themselves),
#      and this value is stored in a variable named r.

# The getAnswer() function is called with r as the argument 
# ➎. The program execution moves to the top of the getAnswer() function 
# ➌, and the value r is stored in a parameter named answerNumber. 
# Then, depending on the value in answerNumber, the function returns one of many possible string values.
#  The program execution returns to the line at the bottom of the program that originally called getAnswer() 
#  ➎. The returned string is assigned to a variable named fortune, which then gets passed to a print() call 
#  ➏ and is printed to the screen.