# To create a Fibonacci series of n terms.
# Made by Nouman

def fibonacci(n):
	first=0
	second=1
	print(0)
	print(1)
	for i in range(1,n-1):
		sum=first+second
		first=second
		second=sum
		print(second)

num=int(input("Enter the number of terms: "))
fibonacci(num)