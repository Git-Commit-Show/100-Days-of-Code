def draw(n):
	k=0
	for i in range (1,n+1):
		for j in range (i):
			print(chr(65+k), end=" ")
			k+=1
		print()

draw(5)