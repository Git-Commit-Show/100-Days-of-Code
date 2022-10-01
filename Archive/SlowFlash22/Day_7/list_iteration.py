import sys

# Set up a list for our code to work with that omits the first CLI argument, 
# which is the name of our script (list_iteration.py)
order_of_succession = sys.argv
order_of_succession.pop(0)
i=1
for item in order_of_succession:
    print(f"{i}. {item}")
    i += 1