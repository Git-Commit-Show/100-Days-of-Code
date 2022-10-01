# To add two list [ adding elements of list ]
# Made by Nouman

def add_2_list(l1,l2):
	res=[]
	for i in range(len(l1)):
		res.append(l1[i]+l2[i])
	return res

list1=[]
list2=[]

n=int(input("Enter the size of the lists :"))

print("\nEnter the terms of list 1:")
for i in range(n):
	list1.append(int(input("Enter term: ")))

print("Enter the terms of list 2:")
for i in range(n):
	list2.append(int(input("Enter term: ")))

print("\nList 1: ",list1)
print("list 2: ",list2)
print("The new list is ",add_2_list(list1, list2))