# Create list , add random 25 numbers in list and print largest number of list [ hint: use ( print( max( L))
# Made by Nouman

import random

def larget_num(n):
	list=[]
	for i in range(n):
		list.append(random.randint(0,10000))
	print("The random list: ",list)
	print("The largest element is: ",max(list))

num=int(input("Enter the total no. of terms: "))
larget_num(num)