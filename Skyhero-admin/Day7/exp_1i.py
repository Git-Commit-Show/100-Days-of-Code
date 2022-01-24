def draw(n):
	for i in range(1, n+1):
		for k in range(0,2*(n-i)):
			print(" ", end="")
		for j in range(0,2*i-1):
			print(" *", end="")
		print("\n")

draw(5)