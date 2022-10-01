l = []
for i in range(int(input("Enter numer of elements: "))):
	l.append(int(input("Enter element: ")))
 
s = int(input("Enter the element to search: ")) 
print("Tuple:",tuple(l))
print("Index of",s,":",tuple(l).index(s))