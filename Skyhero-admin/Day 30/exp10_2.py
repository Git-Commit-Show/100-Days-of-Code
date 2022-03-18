l = [x for x in range(101)]
print(tuple(l))
y = list()
for i in l:
	if i%2 == 0:
		y.append(i)
print(tuple(y))