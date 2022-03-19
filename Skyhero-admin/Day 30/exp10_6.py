import pickle as p

s = "This is experiment 10 question number 6"
l = [x for x in s]
t = tuple(l)
d = {x:x*2 for x in s}
res = [s, l, t, d]

for i in range(len(res)):
	with open("pickle"+str(i), 'wb') as w:
		p.dump(res[i], w)

for i in range(len(res)):
	with open("pickle"+str(i), 'rb') as r:
		x = p.load(r)
		print(x, type(x), "\n")