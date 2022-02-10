# To check whether a given number is present in list or not?
# Made by Nouman

def check_list():
	list=[]
	num=int(input("Enter the total no. of terms: "))
	for i in range(num):
		list.append(int(input("Enter term: ")))

	target=int(input("Enter the target term: "))
	print(list)
	if target in list:
		print("The target term ",target," is present in the list at index ",list.index(target))
	else:
		print("The target term ",target," is NOT present in the list")

check_list()