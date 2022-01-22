import sys

# Set up a list for our code to work with that omits the first CLI argument, 
# which is the name of our script (fizzbuzz.py)
inputs = sys.argv
inputs.pop(0)

for i in inputs:
    x = int(i)
    if x%3==0 and x%5==0:
        print("fizzbuzz")
    elif x%3==0:
        print("fizz")
    elif x%5==0:
        print("buzz")
    else:
        print(i)