l = []
for i in range(int(input("Enter number of elements: "))):
	l.append(int(input("Enter numbers: ")))

t = tuple(l)
print("Sum => ", sum(t))
print("Avg => ", sum(t)/len(t))