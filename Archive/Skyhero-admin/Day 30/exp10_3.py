l = [x for x in range(101)]
t1 = tuple(l)
y = list()
for i in l:
	if i%2 == 0:
		y.append(i)

t2 = tuple(y)
print("Concatenated tuple:\n"+str(t1+t2))