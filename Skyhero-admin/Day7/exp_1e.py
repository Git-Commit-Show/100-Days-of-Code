def draw(n):
	for i in range (1,n+1):
		for j in range (i):
			print(chr(65+j), end=" ")
		print()

draw(5)