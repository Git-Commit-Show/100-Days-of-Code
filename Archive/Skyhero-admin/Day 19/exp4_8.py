# To implement a stack using a list
# Made by Nouman

stack=[]

def push(x):
	stack.append(x)
	print("Stack: ", stack)
	print(x," pushed into stack")

def pop():
	x=stack.pop()
	print("\nPopped: ",x)
	print("Stack :",stack)

size=int(input("Enter size of stack: "))

print("\nEnter elements into stack: ")
for i in range(size):
	x=int(input("\nInput: "))
	push(x)

for i in range(size):
	pop()