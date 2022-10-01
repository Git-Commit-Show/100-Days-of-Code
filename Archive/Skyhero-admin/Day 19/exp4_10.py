# To sort a given number list in ascending order using functions
# Made by Nouman

def sortList(list):
	for i in range(len(list)):
		for j in range(i,len(list)):
			if(list[i]>list[j]):
				list[i], list[j]=list[j], list[i]
	return list

list=[]
num=int(input("Enter the total no. of terms: "))
for i in range(num):
	list.append(int(input("Enter term: ")))
print("Before sorting: ",list)
print("Sorted list: ",sortList(list))