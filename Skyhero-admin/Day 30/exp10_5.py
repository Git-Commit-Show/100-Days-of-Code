t = ("Mumbai", "Los Angeles", "Mumbai", "Mexico", "New York", "Mumbai", "Mexico")
i = input("Enter the element: ")

if i in t:
	index = t.index(i)
	print("The firt occurance of element",i,"is at index:",index)

else:
	print("Element is not present in the tuple")