def draw(n):
	for i in range (1,n+1):
		for j in range (i):
			print(j, end=" ")
		print()

draw(5)