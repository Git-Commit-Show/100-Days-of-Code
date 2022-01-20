n=int(input("Enter the range :"))

def draw(n):
	for i in range(1,n+1):
		for j in range(i):
			print(j+1,end=" ")
		print("\n")

draw(5)
