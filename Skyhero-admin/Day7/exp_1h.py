def draw(n):
	for i in range (n+1, 1, -1):
		for j in range (1,i):
			print(j, end=" ")
		print()

draw(5)