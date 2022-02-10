# To demonstrate any 10 methods of List
# Made by Nouman

list=[]

# 1.append() method
print("1.append() method")
for i in range(20,0,-1):
	list.append(i)
print(list,"\n")

# 2.sort() method
print("2.sort() method")
list.sort()
print(list,"\n")

# 3.copy() method
print("3.copy() method")
list2=list.copy()
print(list2,"\n")

# 4.extend() method
print("4.extend() method")
list.extend(list2)
print(list,"\n")

# 5.count() method
print("5.count() method")
print("Count of 5: ",(list.count(5)),"\n")

# 6.insert() method
print("6.insert() method")
list.insert(2,10)
print(list,"\n")

# 7.index() method
print("7.index() method")
print("Index of 4 is: ",list.index(4),"\n")

# 8.pop() method
print("8.pop() method")
print("Popped out element: ",list.pop())
print(list,"\n")

# 9.reverse() method
print("9.reverse() method")
list.reverse()
print(list,"\n")

# 10.clear() method
print("10.clear() method")
list.clear()
print(list,"\n")